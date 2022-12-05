class Dog(name: String, location: String, food: String) : Animal(name, location, food) {
    override fun makeNoise() {
        println("Bark!")
    }

    override fun sleep() {
        println("This dog sleeps.")
    }
}