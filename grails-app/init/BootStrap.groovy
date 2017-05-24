import br.com.pecorelli.Role
import br.com.pecorelli.SecUser
import br.com.pecorelli.SecUserRole

class BootStrap {

    def init = { servletContext ->
        if(!Role.findAll()){
            def roleAdmin = new Role(authority: "ROLE_ADMIN").save(flush:true)
            def userAdmin = new SecUser(username: "Jean", password: "1234", accountExpired: false, accountLocked: false, passwordExpired: false, enabled: true).save(flush: true)
            SecUserRole.create(userAdmin, roleAdmin)
        }
    }
    def destroy = {
    }
}
