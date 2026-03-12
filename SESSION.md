# 🔁 CLAUDE SESSION RESUME FILE
# Paste this entire file at the start of every new Claude chat

---

## WHO I AM
- Context: DevOps learner switching from HCL (3.6 yrs exp)
- Goal: Production-grade DevOps in 60 days → job from July 2026
- Machine: Windows with VS Code
- Project Location: D:\Projects\shopease
- AWS: Free tier only
- GitHub username: yuvraj1120
- Repo URL: https://github.com/yuvraj1120/shopease

---

## MASTER PROMPT LOCATION
https://github.com/yuvraj1120/shopease/blob/main/MASTER_PROMPT.md

---

## CURRENT PROGRESS
- Last completed day: Day 2
- Last completed topic: Git — Branching, PR Workflow, .gitignore, Branch Protection Rules
- Last commit: docs(session): update progress to Day 2 — branching and PR workflow complete
- Current phase: Foundations (Days 1–20)
- Next day to start: Day 3

---

## DAYS COMPLETED

| Day | Tool | Topic | Status |
|-----|------|-------|--------|
| 1 | Git + GitHub | GitHub account, Git install, SSH setup, JDK 17, VS Code + 9 extensions, Spring Boot app built and running on localhost:8080 | ✅ Done |
| 2 | Git | Feature branch, PR workflow, .gitignore update, branch protection rules, merge strategies | ✅ Done |

---

## 🎨 CHEATSHEET SYSTEM
# Claude MUST read this section and generate a cheatsheet at the end of EVERY day

CHEATSHEET_PROMPT location: shopease/CHEATSHEET_PROMPT.md
Full instructions for generating cheatsheets are in that file.

QUICK RULES FOR CLAUDE:
1. After delivering every day's full lesson, AUTOMATICALLY generate the cheatsheet HTML
2. No need for user to ask — it comes with every day
3. Name format: dayNN-toolname-cheatsheet.html
4. Always 3 pages: Page1=Concepts+Diagram, Page2=Commands+Steps, Page3=Interview+Resume
5. Always dark theme (#0d1117 bg), 1200px wide, download buttons at top
6. Use html2canvas CDN for PNG download buttons
7. Save instruction to user: "Save to D:\Projects\shopease\cheatsheets\"

Cheatsheets generated so far:
| Day | File | Status |
|-----|------|--------|
| 1 | day01-git-basics-cheatsheet.html | ✅ Done |
| 2 | day02-git-branching-cheatsheet.html | ✅ Done |

Last cheatsheet file: day02-git-branching-cheatsheet.html
Cheatsheets folder on machine: D:\Projects\shopease\cheatsheets\
PNG images used for: 60-day DevOps master document (Word/Google Doc)

---

## WHAT WE BUILT ON DAY 1

### App is Running ✅
- Spring Boot app running on localhost:8080
- http://localhost:8080/products → returns 3 products JSON
- http://localhost:8080/actuator/health → returns UP
- http://localhost:8080/h2-console → H2 database UI

### Files Created ✅
```
shopease/
├── .gitignore
├── README.md
├── PROGRESS.md
├── SESSION.md
├── MASTER_PROMPT.md
├── CHEATSHEET_PROMPT.md        ← NEW: cheatsheet generation rules
├── cheatsheets/                ← NEW: folder for all HTML cheatsheets
│   ├── day01-git-basics-cheatsheet.html
│   └── day02-git-branching-cheatsheet.html
├── pom.xml
└── src/
    ├── main/java/com/shopease/
    │   ├── ShopEaseApplication.java
    │   ├── controller/
    │   │   ├── CartController.java
    │   │   ├── OrderController.java
    │   │   └── ProductController.java
    │   ├── model/
    │   │   ├── Cart.java
    │   │   ├── Order.java
    │   │   ├── OrderRequest.java
    │   │   └── Product.java
    │   └── service/
    │       ├── CartService.java
    │       ├── OrderService.java
    │       └── ProductService.java
    └── resources/
        └── application.properties
```

### Issues Fixed on Day 1 ✅
- Red errors in VS Code → fixed by mvn clean install
- Unchecked cast in OrderController → fixed with OrderRequest DTO
- Unused import in CartService → removed Optional import
- H2Dialect warning → removed from application.properties
- open-in-view warning → added spring.jpa.open-in-view=false
- Test folder red error → fixed with .vscode/settings.json

---

## WHAT WE DID ON DAY 2 ✅
- Created feature branch: feature/day2-gitignore-update
- Updated .gitignore with professional rules (Java/Maven, Spring secrets, AWS keys, Terraform)
- Updated PROGRESS.md with Day 2 row
- Opened PR on GitHub with proper title + description
- Added code review comment on *.pem line
- Merged PR → purple Merged badge confirmed
- Deleted feature branch (remote on GitHub + local)
- Set up Branch Protection Rules (Ruleset: protect-main, Status: Active)
  → Restrict deletions, Require PR before merging, Block force pushes

---

## WHAT'S INSTALLED ON MY MACHINE

- [x] Git — version: 2.x.x
- [x] Java 17 — version: 17.0.18
- [x] Maven — version: 3.x.x
- [x] VS Code — with 9 extensions:
      Extension Pack for Java, Spring Boot Extension Pack,
      Docker, Kubernetes, HashiCorp Terraform,
      YAML by Red Hat, GitLens, Prettier, Material Icon Theme
- [ ] Docker Desktop — NOT YET (Day 11)
- [ ] minikube — NOT YET (Day 41)
- [ ] kubectl — NOT YET (Day 41)
- [ ] Terraform — NOT YET (Day 21)
- [ ] Ansible — NOT YET (Day 25)
- [ ] Jenkins — NOT YET (Day 10)
- [ ] SonarQube — NOT YET (Day 8)
- [ ] Nexus — NOT YET (Day 9)

---

## AWS RESOURCES CURRENTLY RUNNING
None — AWS starts Day 21

---

## BLOCKERS / ISSUES
- Day 2: PR merge button stuck loading → resolved by waiting and clicking Confirm Merge
- Everything else working perfectly

---

## HOW TO USE IN NEW CHAT — Exact Script

Open new Claude chat and paste exactly this:

"Hi Claude. I am continuing my 60-day DevOps learning journey.
Here is my session file: [PASTE THIS SESSION.md]
Here is my master prompt: [PASTE MASTER_PROMPT.md]

IMPORTANT: Also read CHEATSHEET_PROMPT.md from my repo.
It tells you to generate a visual HTML cheatsheet at the end
of every day's lesson automatically.

Please start Day [N]."

---

## NEXT: Day 3 — Maven: Build Lifecycle, Running Tests, Generating JAR