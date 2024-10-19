<h1>Traffic Light Simulator</h1>

  <h2>Overview</h2>
    <p>
        The <code>TrafficLightSimulator</code> program simulates the operation of a traffic light system over a 24-hour period. 
        It models how traffic lights adapt their durations for green, yellow, and red lights based on different traffic conditions 
        throughout the day. This is achieved by simulating each minute of the day, adjusting the light durations during peak traffic 
        hours, normal periods, and low-traffic nighttime hours.
    </p>

  <h2>Features</h2>
    <ul>
        <li><strong>Time-Based Traffic Simulation:</strong> The program runs a simulation of a full day, representing each minute with adjustments in traffic light durations.</li>
        <li><strong>Dynamic Traffic Conditions:</strong> Uses time-based conditions to classify periods as "Morning Rush Hour," "Evening Rush Hour," "Night," and "Normal." This allows the simulation to adapt light timings accordingly.</li>
        <li><strong>Realistic Light Cycle Simulation:</strong> Implements realistic light cycles with different durations for green, yellow, and red lights depending on traffic conditions.</li>
    </ul>

  <h2>Key Components and Control Structures</h2>
    <h3>Main Simulation Loop</h3>
    <p>
        Uses a <code>for</code> loop to iterate through each minute of a 24-hour day (1440 minutes). This loop provides a structured way to simulate time progression. 
        <code>Thread.sleep(50)</code> introduces a short delay between iterations, simulating real-world time passing. The <code>try-catch</code> block around the 
        <code>Thread.sleep</code> ensures the program handles any interruptions gracefully.
    </p>

  <h3>Traffic Condition Determination</h3>
    <p>
        The <code>determineTrafficCondition</code> method uses <code>if-else</code> statements to categorize the time into different traffic conditions 
        such as "Morning Rush Hour," "Evening Rush Hour," "Night," and "Normal." This structure enables easy modification and addition of new conditions based on time ranges.
    </p>

   <h3>Dynamic Green and Red Light Durations</h3>
    <p>
        The <code>setGreenLightDuration</code> method uses a <code>switch</code> statement to select green light durations based on the current traffic condition. 
        The <code>switch</code> provides clarity when selecting among multiple options. 
        The <code>setRedLightDuration</code> method uses an <code>if-else</code> structure to adjust the red light duration, focusing on simpler conditions, 
        such as extending the red light during nighttime.
    </p>

  <h3>Light Cycle Simulation</h3>
    <p>
        The <code>simulateTrafficLight</code> method displays the duration of each light color (green, yellow, and red) based on the calculated values. 
        This modular approach allows easy adjustments to the light cycle.
    </p>

  <h2>Real-World Application</h2>
    <p>
        The program models real-world traffic light operations by adjusting light durations to match varying traffic volumes throughout the day. For example, 
        during morning and evening rush hours, the green light duration is extended to accommodate higher vehicle flow. At night, when traffic is sparse, 
        the red light duration is longer to prioritize pedestrian safety.
    </p>
    <p>
        This simple simulation can serve as a foundation for more complex traffic management systems, including real-time adjustments using sensors or emergency vehicle priority handling.
    </p>

  <h2>Limitations and Improvements</h2>
    <ul>
        <li><strong>Simplified Traffic Conditions:</strong> The simulation uses pre-defined time ranges to determine traffic conditions, whereas real traffic systems often use sensors to measure traffic density dynamically.</li>
        <li><strong>No Emergency Handling:</strong> The current program does not account for emergency vehicle detection or priority handling. This could be added by introducing a mechanism to detect emergency vehicles and temporarily adjust the light cycle.</li>
        <li><strong>Pedestrian Crossings:</strong> Adding a feature for pedestrian crossings that interrupts the normal cycle could make the simulation more realistic.</li>
    </ul>

  <h2>Future Enhancements</h2>
    <ul>
        <li>Implement user input to manually adjust traffic conditions.</li>
        <li>Integrate a feature for detecting and prioritizing emergency vehicles.</li>
        <li>Add pedestrian crossing logic to further simulate real-world intersections.</li>
    </ul>

  <h2>Conclusion</h2>
    <p>
        The <code>TrafficLightSimulator</code> program effectively demonstrates how control structures in Java can simulate real-world traffic light behavior. 
        By using a combination of loops, conditionals, and methods, the code achieves a balance between readability, modularity, and functionality. 
        It serves as a good example of applying programming concepts to solve practical problems.
    </p>
