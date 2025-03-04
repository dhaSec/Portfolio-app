package com.example.pa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing buttons
        val btnPersonalInfo = findViewById<Button>(R.id.btnPersonalInfo)
        val btnSkills = findViewById<Button>(R.id.btnSkills)
        val btnQualifications = findViewById<Button>(R.id.btnQualifications)
        val btnInterests = findViewById<Button>(R.id.btnInterests)
        val btnProjects = findViewById<Button>(R.id.btnProjects)
        val btnIdealJob = findViewById<Button>(R.id.btnIdealJob)

        // Setting up click listeners to open respective activities
        btnPersonalInfo.setOnClickListener {
            startActivity(Intent(this, PersonalInfoActivity::class.java))
        }

        btnSkills.setOnClickListener {
            startActivity(Intent(this, SkillsActivity::class.java))
        }

        btnQualifications.setOnClickListener {
            startActivity(Intent(this, QualificationsActivity::class.java))
        }

        btnInterests.setOnClickListener {
            startActivity(Intent(this, InterestsActivity::class.java))
        }

        btnProjects.setOnClickListener {
            startActivity(Intent(this, ProjectsActivity::class.java))
        }

        btnIdealJob.setOnClickListener {
            startActivity(Intent(this, IdealJobActivity::class.java))
        }
    }
}
