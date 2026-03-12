# 🎨 CHEATSHEET GENERATION INSTRUCTIONS
# Claude must read this file and generate a visual cheatsheet at the END of every day's lesson.

---

## WHAT TO GENERATE

At the end of EVERY day's lesson, generate a single HTML file named:
`dayNN-toolname-cheatsheet.html`
Example: `day03-maven-cheatsheet.html`, `day10-jenkins-cheatsheet.html`

---

## FILE STRUCTURE — Always 3 Pages Inside One HTML

### PAGE 1 — Concepts + Diagram + Workflow
- Title: "Day N — [Tool]: [Topic] · Page 1 of 3"
- Section 1: Key concept diagram (how the tool works, pipeline, zones — visual boxes with arrows)
- Section 2: 4 key concepts of the day (concept name + what it is + analogy + code example)
- Section 3: Workflow diagram (step by step how the tool fits into the DevOps pipeline)

### PAGE 2 — All Commands + Hands-On Steps
- Title: "Day N — [Tool]: [Topic] · Page 2 of 3"
- Section 1: ALL commands learned that day (grouped by category, with comments explaining each)
- Section 2: Step by step hands-on flow (what we built today, with exact commands)
- Section 3: Best practices vs mistakes table (✅ Do This vs ❌ Never Do This)

### PAGE 3 — Interview Q&A + Resume Tip + Commit
- Title: "Day N — [Tool]: [Topic] · Page 3 of 3"
- Section 1: 4 Beginner Qs with full answers (green badges)
- Section 2: 4 Intermediate Qs with full answers (yellow badges)
- Section 3: 2 Scenario + 2 Trick Qs with full answers (red + purple badges)
- Section 4: Today's commit (exact commands) + Resume tip (exact bullet to add)

---

## DESIGN RULES — Always Follow These

```
Color scheme (dark theme — always):
  Background:     #0d1117
  Card:           #161b22
  Border:         #30363d
  Code bg:        #1c2128
  Green:          #3fb950  (commands, success, beginner)
  Blue:           #58a6ff  (concepts, info, intermediate)
  Purple:         #bc8cff  (tricks, merge, special)
  Orange:         #ffa657  (warnings, ci/cd)
  Yellow:         #e3b341  (highlights, intermediate)
  Red:            #f85149  (errors, danger, scenario)
  Text:           #e6edf3
  Muted:          #8b949e

Fonts:
  Headings:  Syne (Google Fonts)
  Code:      JetBrains Mono (Google Fonts)

Page width: 1200px fixed (so PNG always same size)
Page padding: 38px

Each page must have:
  - Header: page title (gradient green→blue) + badge (tool · phase · yuvraj1120)
  - Footer: "Day N — Tool · ShopEase DevOps · #CloudAutonomics · yuvraj1120" + "Page X / 3"
```

---

## DOWNLOAD BUTTONS — Always at Top

```html
4 buttons at top of HTML:
  Button 1 (green):  "⬇ Page 1 — Concepts + Diagram"         → downloads page1 as PNG
  Button 2 (blue):   "⬇ Page 2 — Commands + Steps"           → downloads page2 as PNG
  Button 3 (purple): "⬇ Page 3 — Interview Q&A"              → downloads page3 as PNG
  Button 4 (orange): "⬇ Download All 3 Pages"                → downloads all 3 sequentially

Use html2canvas from CDN:
  https://cdnjs.cloudflare.com/ajax/libs/html2canvas/1.4.1/html2canvas.min.js

Download settings:
  scale: 2          (2x resolution = sharp PNG)
  backgroundColor: '#0d1117'
  useCORS: true
  logging: false
```

---

## DIAGRAM TYPES TO USE (pick the right one for each tool)

```
For pipelines / flow (Jenkins, CI/CD, Maven):
  → Horizontal boxes with arrows between them
  → Each box: icon + label + subtitle + border color

For branching (Git):
  → Inline circles connected by lines
  → Different colors per branch
  → Fork lines using CSS borders

For architecture (AWS, Terraform, K8s):
  → Nested boxes showing hierarchy (VPC → Subnet → EC2)
  → Color coded by layer

For comparisons (merge strategies, reset vs revert):
  → Side by side 3-column cards
  → ASCII diagram inside code block

For step flows (PR, deployments):
  → Vertical list with numbered icons
  → Each row: icon + title + subtitle + step number on right

For concepts (Docker layers, K8s pods):
  → Stacked boxes showing layers
  → Arrows showing relationships
```

---

## NAMING CONVENTION

```
Files saved to: D:\Projects\shopease\cheatsheets\
Naming: dayNN-toolname-cheatsheet.html

Examples:
  day01-git-basics-cheatsheet.html
  day02-git-branching-cheatsheet.html
  day03-maven-cheatsheet.html
  day04-maven-advanced-cheatsheet.html
  day05-sonarqube-cheatsheet.html
  day08-sonarqube-cheatsheet.html
  day09-nexus-cheatsheet.html
  day10-jenkins-cheatsheet.html
  day11-docker-cheatsheet.html
  day21-terraform-cheatsheet.html
  day25-ansible-cheatsheet.html
  day41-kubernetes-cheatsheet.html
  day51-prometheus-grafana-cheatsheet.html

PNG downloads saved to: Downloads folder
Naming: dayNN-pageX-description.png
Examples:
  day03-page1-concepts.png
  day03-page2-commands.png
  day03-page3-interview.png
```

---

## MASTER CHEATSHEET FILE

In addition to daily files, also maintain:
  File: `D:\Projects\shopease\cheatsheets\master-devops-cheatsheet.html`

This file grows every day. It contains ALL days' cheatsheets combined.
Each day append a new section at the bottom.
Structure:
  → Top navigation: Day 1 | Day 2 | Day 3 | ... (anchor links)
  → Each day section has all 3 pages
  → Single download button per page
  → "Download All Days" button at top downloads every page in sequence

---

## HOW CLAUDE KNOWS TO DO THIS IN A NEW CHAT

When user pastes SESSION.md at start of new chat, SESSION.md contains:
  "CHEATSHEET_PROMPT location: shopease/CHEATSHEET_PROMPT.md"

Claude must:
  1. Read CHEATSHEET_PROMPT.md from the session context
  2. After delivering the day's lesson, generate the cheatsheet HTML
  3. Follow ALL rules in this file exactly
  4. Name file correctly: dayNN-toolname-cheatsheet.html
  5. Present the file for download

---

## REMINDER LINE FOR SESSION.md

Add this line to SESSION.md under a new section called "CHEATSHEET SYSTEM":

  CHEATSHEET_PROMPT: shopease/CHEATSHEET_PROMPT.md
  Cheatsheet generated for days: 1, 2 (add each day after generation)
  Last cheatsheet file: day02-git-branching-cheatsheet.html
  Format: 3-page HTML with download buttons → PNG for 60-day DevOps document
  Folder on machine: D:\Projects\shopease\cheatsheets\

---

## EXAMPLE TRIGGER — What User Says to Get Cheatsheet

At end of every day lesson, user says:
  "Day N done, start Day N+1"

Claude automatically:
  1. Delivers Day N+1 full lesson
  2. At the END adds: "Here is your Day N+1 Visual Cheatsheet:"
  3. Generates and presents the HTML file
  4. Says: "Save as dayNN-tool-cheatsheet.html in D:\Projects\shopease\cheatsheets\"

No need to ask for it — it comes automatically every single day.