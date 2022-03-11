<html>
<h3>String operationer</h3>

<p>Implementer metoden <code>getInitials(String fullName)</code></p>
<p>Metoden modtager det fulde navn på en person, som kan bestå af to eller flere navne. </p>
<p>Metoden finder det første bogstav i alle navnene, og sætte dem sammen i en String variabel, som returneres.</p>

eksempel 1:
<li>Input: Trine Dyrholm</li>
<li>Output: TD</li>
eksempel 2:
<li> Input: Nikolaj Lie Kaas </li>
<li>Output: NLK</li>

<div class="hint">
   Brug <code>split(" ")</code> til lave det fulde navn om til et String array:<br>
    <code>String [] names = fullName.split(" ");</code><br>
    Hvert navn i <code>fullName</code> står nu på sin egen plads i array'et. <br>
</div> <div class="hint">Gennemløb array'et med et <code>for-each</code> loop. <br>
    Brug <code>chartAt(0)</code> til at finde første bogstav i hvert navn
    <p><strong>obs:</strong> Vær opmærksom på at <code>chartAt()</code> returnerer en char. <br>
    Hvis String variablen ikke er initialiseret før man assigner en char til den, <br>
    får man en type fejl. </p>
</div>

</html>