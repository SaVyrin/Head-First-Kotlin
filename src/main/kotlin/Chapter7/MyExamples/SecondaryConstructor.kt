package Chapter7.MyExamples

// class with secondary constructor has to call primary constructor
// here it can be replaced with default values
class Fridge(val size: Int, val minTemperature: Int) {
    constructor(size_param: Int) : this(size_param, -30) {
    }
}

// replaced secondary constructor with default value
class FridgeWithDefault(val size: Int, val minTemperature: Int = -30) {
}
