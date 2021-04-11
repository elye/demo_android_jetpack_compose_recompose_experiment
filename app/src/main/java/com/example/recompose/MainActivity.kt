package com.example.recompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.activity.compose.setContent
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

var levelControl1 = 0
var levelControl2 = 0
var levelControl3 = 0
var levelControl4 = 0

var levelDashboardHierarchicalBreakdown1 = 0
var levelDashboardHierarchicalBreakdown2 = 0
var levelDashboardHierarchicalBreakdown3 = 0
var levelDashboardHierarchicalBreakdown4 = 0

var levelDashboardHierarchicalCombine1 = 0
var levelDashboardHierarchicalCombine2 = 0
var levelDashboardHierarchicalCombine3 = 0
var levelDashboardHierarchicalCombine4 = 0

var levelDashboardFlattenBreakdown1 = 0
var levelDashboardFlattenBreakdown2 = 0
var levelDashboardFlattenBreakdown3 = 0
var levelDashboardFlattenBreakdown4 = 0

var levelDashboardFlattenCombine1 = 0
var levelDashboardFlattenCombine2 = 0
var levelDashboardFlattenCombine3 = 0
var levelDashboardFlattenCombine4 = 0

var isOn1 by mutableStateOf(0)
var isOn2 by mutableStateOf(0)
var isOn3 by mutableStateOf(0)
var isOn4 by mutableStateOf(0)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Control Buttons")
                Control()
                Text(text = "Hierarchical breakdown composables")
                DashboardHierarchicalBreakdown()
                Text(text = "Flatten breakdown composables")
                DashboardFlattenBreakdown()
                Text(text = "Hierarchical combine composables")
                DashboardHierarchicalCombine()
                Text(text = "Flatten combine composables")
                DashboardFlattenCombine()
            }
        }
    }
}

@Composable
fun DashboardHierarchicalCombine() {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(Color.Gray)) {
        levelDashboardHierarchicalCombine1++
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Recompose: $levelDashboardHierarchicalCombine1; Update: $isOn1",
            textAlign = TextAlign.Center
        )
        Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(color = Color.Red)) {
            levelDashboardHierarchicalCombine2++
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Recompose: $levelDashboardHierarchicalCombine2; Update: $isOn2",
                textAlign = TextAlign.Center
            )
            Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(color = Color.Green)) {
                levelDashboardHierarchicalCombine3++
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Recompose: $levelDashboardHierarchicalCombine3; Update: $isOn3",
                    textAlign = TextAlign.Center
                )
                Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(color = Color.Yellow)) {
                    levelDashboardHierarchicalCombine4++
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(8.dp)
                            .background(color = Color.Yellow),
                        text = "Recompose: $levelDashboardHierarchicalCombine4; Update: $isOn4",
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
fun DashboardFlattenCombine(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(Modifier.background(Color.Gray)) {
            levelDashboardFlattenCombine1++
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Recompose: $levelDashboardFlattenCombine1; Update: $isOn1",
                textAlign = TextAlign.Center
            )
        }
        Column {
            levelDashboardFlattenCombine2++
            Text(
                modifier = Modifier.fillMaxWidth().background(color = Color.Red),
                text = "Recompose: $levelDashboardFlattenCombine2; Update: $isOn2",
                textAlign = TextAlign.Center
            )
        }
        Column {
            levelDashboardFlattenCombine3++
            Text(
                modifier = Modifier.fillMaxWidth().background(color = Color.Green),
                text = "Recompose: $levelDashboardFlattenCombine3; Update: $isOn3",
                textAlign = TextAlign.Center
            )
        }
        Column {
            levelDashboardFlattenCombine4++
            Text(
                modifier = Modifier.fillMaxWidth().background(color = Color.Yellow),
                text = "Recompose: $levelDashboardFlattenCombine4; Update: $isOn4",
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun DashboardHierarchicalBreakdown() {
    Dashboard11()
}

@Composable
fun Dashboard11() {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(Color.Gray)) {
        levelDashboardHierarchicalBreakdown1++
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Recompose: $levelDashboardHierarchicalBreakdown1; Update: $isOn1",
            textAlign = TextAlign.Center
        )
        Dashboard12()
    }
}

@Composable
fun Dashboard12() {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(color = Color.Red)) {
        levelDashboardHierarchicalBreakdown2++
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Recompose: $levelDashboardHierarchicalBreakdown2; Update: $isOn2",
            textAlign = TextAlign.Center
        )
        Dashboard13()
    }
}

@Composable
fun Dashboard13() {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(color = Color.Green)) {
        levelDashboardHierarchicalBreakdown3++
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Recompose: $levelDashboardHierarchicalBreakdown3; Update: $isOn3",
            textAlign = TextAlign.Center
        )
        Dashboard14()
    }
}

@Composable
fun Dashboard14() {
    levelDashboardHierarchicalBreakdown4++
    Text(
        modifier = Modifier.fillMaxWidth().padding(8.dp).background(color = Color.Yellow),
        text = "Recompose: $levelDashboardHierarchicalBreakdown4; Update: $isOn4",
        textAlign = TextAlign.Center
    )
}

@Composable
fun DashboardFlattenBreakdown() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Dashboard21()
        Dashboard22()
        Dashboard23()
        Dashboard24()
    }
}


@Composable
fun Dashboard21() {
    Column(Modifier.background(Color.Gray)) {
        levelDashboardFlattenBreakdown1++
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Recompose: $levelDashboardFlattenBreakdown1; Update: $isOn1",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Dashboard22() {
    Column {
        levelDashboardFlattenBreakdown2++
        Text(
            modifier = Modifier.fillMaxWidth().background(color = Color.Red),
            text = "Recompose: $levelDashboardFlattenBreakdown2; Update: $isOn2",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Dashboard23() {
    Column {
        levelDashboardFlattenBreakdown3++
        Text(
            modifier = Modifier.fillMaxWidth().background(color = Color.Green),
            text = "Recompose: $levelDashboardFlattenBreakdown3; Update: $isOn3",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Dashboard24() {
    Column {
        levelDashboardFlattenBreakdown4++
        Text(
            modifier = Modifier.fillMaxWidth().background(color = Color.Yellow),
            text = "Recompose: $levelDashboardFlattenBreakdown4; Update: $isOn4",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Control() {
    Column(modifier = Modifier.fillMaxWidth().background(Color.Gray)) {
        levelControl1++
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Recompose: $levelControl1",
            textAlign = TextAlign.Center
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
            onClick = { isOn2++ }) {
            Column {
                levelControl2++
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Recompose: $levelControl2",
                    textAlign = TextAlign.Center
                )
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
                    onClick = { isOn3++ }) {
                    Column {
                        levelControl3++
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Recompose: $levelControl3",
                            textAlign = TextAlign.Center
                        )
                        Button(
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                            onClick = { isOn4++ }) {
                            levelControl4++
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Recompose: $levelControl4",
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}
