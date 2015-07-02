package pc


class ElegirComponenteCommand {
	String modeloMother
	
	
	static constraints = {
		
	}
}
class EnsambleController {

    def index() {

    	render "Ensamble su propia PC"
    	[command: new ElegirComponenteCommand()]

     }

     def elegirMother(){


     }


}
