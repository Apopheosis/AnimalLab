class Cat(name: String, location: String, food: String) : Animal(name, location, food) {
    override fun makeNoise() {
        println("Meow!")
    }

    override fun sleep() {
        println("This cat sleeps")
    }


}