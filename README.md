# SecureVault-Login-Manager
🛡️ SecureVault Login Manager — a reusable Kotlin console tool that demonstrates the five scoped functions clearly while staying practical and open for extension (logging, security modules, user management, etc.).

**Description:**
A Kotlin console project that demonstrates all five scoped functions — `let`, `run`, `apply`, `with`, and `also` — in a practical, security-themed workflow.
It’s designed for learning, testing, and educational reuse.

**Key Features:**

* Clean OOP structure (`User` class + methods)
* Realistic audit logs and security simulation
* ISO-formatted timestamp for logging
* Clear console output for each scoped function
* MIT-licensed — free for educational/public use

---

### 💡 **Usage**

```bash
kotlinc SecureVault.kt -include-runtime -d SecureVault.jar
java -jar SecureVault.jar
```

---

### 🧠 **Educational Objective**

| Scoped Function | Real-World Role   | Example                        |
| --------------- | ----------------- | ------------------------------ |
| `apply`         | Initialize setup  | Create & configure user object |
| `also`          | Audit / logging   | Log login attempt              |
| `run`           | Execution context | Run security scan              |
| `let`           | Safe validation   | Check credentials              |
| `with`          | Final display     | Show dashboard                 |

---

### 📜 License (MIT)

```text
Copyright (c) 2025 Muhammad Arslan
Permission is hereby granted, free of charge, to any person obtaining a copy of this software...
```

---

Would you like me to **generate the full GitHub-ready `README.md` file** next (with badges, sections, and contribution instructions)?
It’ll make your repository look professional and attractive to learners worldwide 🌍
