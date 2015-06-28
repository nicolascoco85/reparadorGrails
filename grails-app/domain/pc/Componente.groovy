package pc

abstract class Componente {

	String tipoConector
	String detalle

    static constraints = {
    }

    abstract boolean esCompatibleCon(Motherboard mother)
}
