# Set Tasks

In this section, you will work with `Set` to manage the toys of the kids at the playground.

## Basic Tasks

### Task 1: Add Toys to Kids

1. Create a `HashSet` to store the toys of each kid at the playground.
2. Implement a method that allows you to add a new toy to a kid's set of toys.
3. Test the method by adding toys to the sets of a few kids.

### Task 2: Show Toys of a Kid

1. Implement a method to display all the toys of a specific kid.
2. Test the method to ensure that all the toys of the selected kid are displayed correctly.

### Task 3: Show All Toys

1. Implement a method to display all the toys available at the playground.
2. Test the method to ensure that all the toys are displayed correctly.

### Task 4: Update Toy Information

1. Implement a method that allows you to update a toy's information (name, age group, price) based on its name.
2. Test the method by updating the information of a few toys.

### Task 5: Remove a Toy from a Kid's Set

1. Implement a method to remove a specific toy from a kid's set of toys.
2. Test the method by removing toys from the sets of a few kids.

### Task 6: Show All Toys Sorted by Price

1. Create a `TreeSet` to store all the toys available at the playground.
2. Implement a method that adds all the toys to the `TreeSet` and sorts them by default by price.
3. Test the method to ensure that all the toys are displayed in ascending order of price.

### Task 7: Show All Toys Sorted by Age Group

1. Create a custom `Comparator` to sort toys based on their age group.
2. Implement a method that adds all the toys to the `TreeSet` and sorts them by age group using the custom comparator.
3. Test the method to ensure that all the toys are displayed in the correct order of age group.

## Optional Challenges

Feel free to attempt the following challenges to further enhance the playground:

### Challenge 1: Find Kids with Common Toys

In this challenge, you need to implement a method that finds kids who have common toys with other kids. 
To accomplish this, you will need to modify the equals and hashCode methods in the Toy class.

Hint: When comparing toys to find common toys, the equals method should consider only the ageGroup field for equality, and the hashCode method should generate a hash code based on the ageGroup.

By making these modifications, you can ensure that the retainAll method works correctly and correctly identifies kids with common toys based on the age group.

Feel free to explore different approaches to implement this functionality and have fun with the challenge!

**Remember, optional challenges are more demanding and may require a deeper understanding of Java features. Have fun exploring these tasks if you feel up to the challenge!**