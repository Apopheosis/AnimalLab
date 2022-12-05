public open class Animal {
    var food: String = ""
    public var location: String = ""
    var name: String = ""
    constructor(name: String, location:String, food: String) {
        this.name = name
        this.location = location
        this.food = food
    }

    open fun makeNoise() {

    }

    fun eat() {
        println("This animal eats the $food")
    }

    open fun sleep() {
        println("This animal sleeps.")
    }
}
