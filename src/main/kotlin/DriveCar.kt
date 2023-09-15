class DriveCar: Drive() {
    override fun ignite(){
        println("Car engine roars rroooooo")
    }

    override fun removeHandBreak() {
        println("Ready to go!")
    }
}