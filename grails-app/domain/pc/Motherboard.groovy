package pc

class Motherboard {
	String modelo
	Set<Conector> conectores

	static hasMany = [conectores : Conector]

    static constraints = {
    }

    boolean tieneEsteConector(Componente componente){

    	Iterator<Conector> it = conectores.Iterator()


    }
}
