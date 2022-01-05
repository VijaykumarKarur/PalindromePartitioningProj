<h4>Palindrome Partitioning</h4>
<hr/>
<b>Problem Description</b>

Given a string A, partition A such that every string of the partition is a palindrome.

Return all possible palindrome partitioning of A.

Ordering the results in the answer : Entry i will come before Entry j if :
len(Entryi[0]) < len(Entryj[0]) OR <br/>
(len(Entryi[0]) == len(Entryj[0]) AND len(Entryi[1]) < len(Entryj[1])) OR * * *<br/>
(len(Entryi[0]) == len(Entryj[0]) AND ... len(Entryi[k] < len(Entryj[k]))<br/>

<hr/>

<b>Problem Constraints</b>

1 <= len(A) <= 15
<hr/>


<b>Input Format</b>

First argument is a string A of lowercase characters.

<hr/>

<b>Output Format</b>

Return a list of all possible palindrome partitioning of s.
<hr/>


<b>Example Input</b>

Input 1:

A = "aab"

Input 2:

A = "a"
<hr/>

<b>Example Output</b>

Output 1:

[
["a","a","b"]
["aa","b"],
]

Output 2:

[
["a"]
]
<hr/>

<b>Example Explanation</b>

Explanation 1:

In the given example, ["a", "a", "b"] comes before ["aa", "b"] because len("a") < len("aa").

Explanation 2:

In the given example, only partition possible is "a" .