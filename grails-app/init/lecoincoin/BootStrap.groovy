package lecoincoin

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: "ROLE_ADMIN").save()
        def userAdminInstance = new User(username: "admin", password: "admin").save()
        UserRole.create(userAdminInstance, adminRole, true)

        def modRole = new Role(authority: "ROLE_MOD").save()
        def userModInstance = new User(username: "modo", password: "modo").save()
        UserRole.create(userModInstance, modRole, true)

        def userRole = new Role(authority: "ROLE_USER").save()
        def userInstance = new User(username: "user", password: "user").save()
        UserRole.create(userInstance, userRole, true)
        (1..20).each {
            new SaleAd(
                    title: "title" + it,
                    descShort: "Short description",
                    descLong: "Long description",
                    price: it
            ).addToIllustrations(new Illustration(filename: "filename.png")).save()
        }

    }
    def destroy = {
    }
}
