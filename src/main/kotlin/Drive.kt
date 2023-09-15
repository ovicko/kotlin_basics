open class Drive {
    open fun ignite(){
    }

    open fun removeHandBreak(){

    }

    open fun checkNeedReverse(direction:String): Boolean {
        if (direction == "back") {
            return true
        }
        return false;
    }
}