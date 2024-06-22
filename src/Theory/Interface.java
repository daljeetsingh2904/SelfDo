package Theory;

public class Interface {

	/**
	 * INTERFACE: 
	 * 
	 * -> is used to achive total abstraction
	 * -> using class we cant achieve multiple inheritance but using interface we can achive it
	 * -> a class can extend only one class but class can implement multiple no. of interface.
	 * ->used to achive loose coupling
	 * -> is used to implemet abstraction.
	 * -> cant create object of interface class
	 * -> only public specifier is used in interface
	 * -> all fields in interface are implicity public ,static,final meaning they are constants
	 * -> class extend class ; class implement interface ; interface extends interface
	 * 
	 * -> Marker or Tagged interface are interface without any methods they serve as marker without any capability.
	 * -> Types of interface are : Functional interface  , Marker Interface
	 * -> Multiple inheritaance is not supported through class in java to avoid problem lke ambiguity
	 *
	 *
	 */




	/**
	 * Functional Interface
	 * 
	 * 
	 * ->It is an interfacae that contains only one abstract method
	 * -> also called as single abstract method
	 */
	
	
	
	/**
	 * When to use interface and abstract class
	 * 
	 * Use an astract class when : 
	 * ->you have shared code that need to be inherited by other related class
	 * ->need to define non static or non final fields
	 * -> when you want to provide common base class that multiple class can inherit from
	 * 	 
	 * 
	 * 
	 * 
	 * Use an interfac whe : 
	 * -> you want to acheive 100% abstraction
	 * -> you want to define contract which can implemented by multiple class regradlesss of class hierarchy
	 * -> you want to achive multiple inhertance
	 * -> when different class use same set of methods
	 * */
}
