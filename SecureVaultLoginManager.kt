/*
 * =============================================================
 *  SecureVault Login Manager
 *  -------------------------------------
 *  Author   : Muhammad Arslan (cosmichackerx)
 *  Language : Kotlin
 *  Purpose  : Demonstrate Kotlin Scoped Functions (let, run, apply, with, also)
 *  License  : MIT License
 * =============================================================
 */

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// =======================
// Data Model
// =======================
data class User(
    var username: String = "",
    var email: String = "",
    var password: String = ""
) {
    fun securityScan(): String {
        // Simulate security checks
        val firewall = true
        val malware = true
        val dataIntegrity = true

        return if (firewall && malware && dataIntegrity) {
            "✅ All systems secure"
        } else if (!firewall && !malware && !dataIntegrity) {
            "⚠️ Warning: Suspicious activity detected"
        } else {
            "🚨 Critical error: System not fully secure"
        }
    }

    fun showDashboard() {
        println("\n📊 ==== User Dashboard ====")
        println("Username : $username")
        println("Email    : $email")
        println("Status   : Logged in successfully ✅")
        println("============================")
    }
}

// =======================
// Main Application
// =======================
fun main() {
    println("🛡️ Welcome to SecureVault Login Manager")
    println("=======================================")

    // ISO 8601 formatted time stamp
    val currentTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)

    // STEP 1: apply → Initialize user
    val user = User().apply {
        username = "Muhammad"
        email = "cosmichackerx@gmail.com"
        password = "1234567"
        println("\n[apply] Initializing user profile...")
    }

    // STEP 2: also → Log activity / audit
    user.also {
        println("[also] ${it.username} attempted login at $currentTime using email: ${it.email}")
    }

    // STEP 3: run → Perform security checks & get result
    val scanResult = user.run {
        println("\n[run] Performing security scan for user '$username'...")
        securityScan()
    }
    println("[run] Result: $scanResult")

    // STEP 4: let → Validate data safely
    val verifiedUser = user.let {
        println("\n[let] Validating user data...")
        if (it.email.isNotEmpty() && it.password.isNotEmpty()) {
            println("✅ Credentials verified for ${it.username}")
            it
        } else {
            println("❌ Invalid credentials! Access denied.")
            null
        }
    }

    // STEP 5: with → Display dashboard if login succeeded
    if (verifiedUser != null) {
        with(verifiedUser) {
            println("\n[with] Loading user dashboard...")
            showDashboard()
            println("✨ Welcome back, $username! Stay safe and secure.")
        }
    } else {
        println("\nUser validation failed. Exiting SecureVault.")
    }

    println("\n🧠 Program executed successfully.")
}
