package pc
class BootStrap {

    def init = { servletContext ->

    	Motherboard m1 = new Motherboard(modelo: "Asus")
    	m1.save(failOnError:true)

    	Motherboard m2 = new Motherboard(modelo: "MSI")
    	m2.save(failOnError:true)

    	Conector c1 = new Conector( tipo: "DDR2", mother: m1)
    	c1.save(failOnError:true)

        Conector c2 = new Conector( tipo: "DDR3", mother: m2)
        c2.save(failOnError:true)

        Conector c3 = new Conector( tipo: "Socket755", mother: m2)
        c3.save(failOnError:true)

    	m1.addToConectores(c1)

        m2.addToConectores(c2)
        m2.addToConectores(c3)

        Procesador p1 = new Procesador(tipoConector: "Socket755")
        p1.save(failOnError:true)

        Procesador p2 = new Procesador(tipoConector: "Socket1150")
        p2.save(failOnError:true)

    }
    def destroy = {
    }
}
