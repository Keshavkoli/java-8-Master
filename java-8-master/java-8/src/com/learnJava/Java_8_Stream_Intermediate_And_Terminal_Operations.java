package com.learnJava;

public class Java_8_Stream_Intermediate_And_Terminal_Operations {
	/*
	 * 1) The main difference between intermediate and terminal operations is that
	 * intermediate operations return a stream as a result and terminal operations
	 * return non-stream values like primitive or object or collection or may not
	 * return anything.
	 * 
	 * 2) As intermediate operations return another stream as a result, they can be
	 * chained together to form a pipeline of operations. Terminal operations can
	 * not be chained together.
	 * 
	 * 3) Pipeline of operations may contain any number of intermediate operations,
	 * but there has to be only one terminal operation, that too at the end of
	 * pipeline.
	 */

	/*
	 * 4) Intermediate operations are lazily loaded. When you call intermediate
	 * operations, they are actually not executed. They are just stored in the
	 * memory and executed when the terminal operation is called on the stream.
	 * 
	 * 5) As the names suggest, intermediate operations doesn’ t give end result.
	 * They just transform one stream to another stream. On the other hand, terminal
	 * operations give end result.
	 * 
	 * 6) Intermediate Operations:
	 * 
	 * map(), filter(), distinct(), sorted(), limit(), skip()
	 * 
	 * Terminal Operations :
	 * 
	 * forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(),
	 * allMatch(), noneMatch(), findFirst(), findAny()
	 */
	
	
//	Java 8 Stream Intermediate Operations
//	They return stream.	
//	They can be chained together to form a pipeline of operations.|		
//	Pipeline of operations may contain any number of intermediate operations. |		
//	Intermediate operations are lazily loaded.	
//	They don’t produce end result.	|
//	Examples :
//	filter(), map(), distinct(), sorted(), limit(), skip()	Examples :

	
	
//	Java 8 Stream Terminal Operations
//	They return non-stream values.
//	They can’t be chained together.		
//	Pipeline of operations can have maximum one terminal operation, that too at the end.
//	Terminal operations are eagerly loaded.
//	They produce end result.
//	Examples :
//	forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
	
	
	
}
