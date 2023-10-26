open class Animalia(animal: String){
    
    var animal: String? = null
    
    init{
        this.animal = animal
    }
    
    open fun consumes(){
        println("$animal consumes food")
    }
}

open class Chordata(chordate: String): Animalia(chordate){
    
    var chordate: String? = null
    
    init{
        this.chordate = chordate
    }
    
    open fun has(){
        println("$chordate has notochord")
    }
}

open class Mammalia(mammal: String): Chordata(mammal){
    
    var mammal: String? = null
    
    init{
        this.mammal = mammal
    }
    
    open override fun has(){
        println("$mammal has hair and mammary glands")
    }
}

open class Carnivora(carnivore: String): Mammalia(carnivore){
    
    var carnivore: String? = null
    
    init{
        this.carnivore = carnivore
    }
    
    open override fun consumes(){
        println("$carnivore consumes flesh")
    }    
}

open class Primata(primate: String): Mammalia(primate){
    
    var primate: String? = null
    
    init{
        this.primate = primate
    }
    
    open override fun has(){
        println("$primate has opposable thumbs")
    }    
}


fun main() {
    
    var human = Primata("Human")
    human.has()
    human.consumes()
    
}
