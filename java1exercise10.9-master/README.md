#### Exercise 10.9
![shapehierarchy](https://raw.githubusercontent.com/bekkam/java1exercise10.9/master/docs/static/shapehierarchy.png "Inheritance hierarchy for `Shapes`")
#### Instructions

##### 1. Implement the `Shape` hierarchy shown above.
- Each `TwoDimensionalShape` should contain the method `getArea` to calculate the area of the two-dimensional shape.
- Each `ThreeDimensionalShape` should have methods `getArea` and `getVolume` to calculate the surface area and volume, respectively, of the three-dimensional shape.

##### 2. Create a program that uses an array of `Shape` references to objects of each concrete class in the hierarchy.
- The program should print a text description of the object to which each array element refers.
- Also, in the loop that processes all the shapes in thh array, determine whether each shape is a `TwoDimensionalShape` or a `ThreeDimensionalShape`.
- If its a `TwoDimensionalShape`, display its area. If its a `ThreeDimensionalShape`, display its area and volume.