package br.com.pecorelli

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.apache.commons.lang.builder.HashCodeBuilder

@ToString(cache=true, includeNames=true, includePackage=false)
class SecUserRole implements Serializable {

	private static final long serialVersionUID = 1

	SecUser secUser
	Role role

	@Override
	boolean equals(other) {
		if (other instanceof SecUserRole) {
			other.secUserId == secUser?.id && other.roleId == role?.id
		}
	}

	@Override
	int hashCode() {
		def builder = new HashCodeBuilder()
		if (secUser) builder.append(secUser.id)
		if (role) builder.append(role.id)
		builder.toHashCode()
	}

	static SecUserRole get(long secUserId, long roleId) {
		criteriaFor(secUserId, roleId).get()
	}

	static boolean exists(long secUserId, long roleId) {
		criteriaFor(secUserId, roleId).count()
	}

	private static DetachedCriteria criteriaFor(long secUserId, long roleId) {
		SecUserRole.where {
			secUser == SecUser.load(secUserId) &&
			role == Role.load(roleId)
		}
	}

	static SecUserRole create(SecUser secUser, Role role) {
		def instance = new SecUserRole(secUser: secUser, role: role)
		instance.save()
		instance
	}

	static boolean remove(SecUser u, Role r) {
		if (u != null && r != null) {
			SecUserRole.where { secUser == u && role == r }.deleteAll()
		}
	}

	static int removeAll(SecUser u) {
		u == null ? 0 : SecUserRole.where { secUser == u }.deleteAll()
	}

	static int removeAll(Role r) {
		r == null ? 0 : SecUserRole.where { role == r }.deleteAll()
	}

	static constraints = {
		role validator: { Role r, SecUserRole ur ->
			if (ur.secUser?.id) {
				SecUserRole.withNewSession {
					if (SecUserRole.exists(ur.secUser.id, r.id)) {
						return ['userRole.exists']
					}
				}
			}
		}
	}

	static mapping = {
		id composite: ['secUser', 'role']
		version false
	}
}
