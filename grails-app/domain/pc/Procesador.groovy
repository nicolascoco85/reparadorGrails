package pc

class Procesador extends Componente{

	
	Procesador (String tipoConector){
	this.tipoConector = tipoConector
	}

    static constraints = {
    }


    boolean esCompatibleCon(Motherboard mother){

    	return mother.tieneEsteConector(this)
    }

}