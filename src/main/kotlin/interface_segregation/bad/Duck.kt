package interface_segregation.bad

class Duck : Animal {
    override fun nameOfAnimal(): String {
        return "duck"
    }

    override fun walk(): String {
        return "the " + nameOfAnimal() + " is walking!"
    }

    override fun fly(): String {
        return "the " + nameOfAnimal() + " is flying!"
    }

    override fun swim(): String {
        return "the " + nameOfAnimal() + " is swimming!"
    }

    override fun bark(): String? {
        return null
    }

    override fun quack(): String {
        return "quack!"
    }

    override fun meow(): String? {
        return null
    }
}