Javascript 
1.Take a sentence as an input and reverse every word in that sentence.
  Example - This is a sunny day > shiT si a ynnus yad.
  
  function reverseWords(sentence) {
  // Split the sentence into words
  const words = sentence.split(" ");
  
  // Reverse each word
  const reversedWords = words.map(word => {
    return word.split("").reverse().join("");
  });

  // Join the reversed words back into a sentence
  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

// Example usage:
const inputSentence = "Hello World";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); // Outputs "olleH dlroW"
...............................................................................................................
2. Perform sorting of an array in descending order.

  const originalArray = [5, 2, 9, 1, 5, 6];

// Sort the array in descending order
originalArray.sort(function(a, b) {
  return b - a;
});

console.log(originalArray); // Outputs: [9, 6, 5, 5, 2, 1]
