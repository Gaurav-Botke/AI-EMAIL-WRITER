🧠 AI Email Writer

An intelligent Gmail-integrated Chrome Extension that automatically generates context-aware email replies using Google’s Gemini Developer API.
This project enhances communication efficiency by allowing users to compose professional and personalized responses instantly — all within Gmail.

🚀 Features

✉️ Smart Email Replies: Generates AI-powered responses based on your email content.

⚡ Seamless Gmail Integration: Works directly inside Gmail’s compose window.

🧩 Gemini API Integration: Uses Gemini Developer API for advanced natural language understanding.

💬 Customizable Tone: Lets users adjust tone and style (formal, casual, concise, etc.).

🔒 Local Execution: Ensures user privacy — data is not stored or shared externally.

🛠️ Tech Stack

Frontend: HTML, CSS, JavaScript

Extension Framework: Chrome Extension Manifest V3

AI Backend: Gemini Developer API (Generative AI)

Runtime Environment: Chrome Browser (Client-Side)


Use It!

Open Gmail and start composing an email

Click the AI Write button to generate a response

📸 Screenshots

(Gmail compose window with AI-generated reply button.)
<img width="1910" height="953" alt="image" src="https://github.com/user-attachments/assets/9066d471-dcfa-4c15-834c-379a65f98fd7" />


🧩 Project Structure
AI-Email-Writer/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/gb/
│   │   │       ├── AiEmailWriterApplication.java
│   │   │       │
│   │   │       ├── controller/
│   │   │       │   └── EmailGeneratorController.java
│   │   │       │
│   │   │       ├── entity/
│   │   │       │   └── EmailRequest.java
│   │   │       │
│   │   │       └── service/
│   │   │           └── EmailGeneratorService.java
│   │   │
│   │   └── resources/
│   │       └── (application.properties or config files)
│   │
│   └── test/
│       └── java/
│
├── target/
│   ├── generated-sources/
│   │   └── annotations/
│   ├── generated-test-sources/
│   │   └── test-annotations/
│   └── (compiled classes and build output)
│
├── pom.xml
├── HELP.md
├── mvnw
├── mvnw.cmd
└── README.md (you’ll add this file)


🔮 Future Enhancements

Add multiple tone presets (formal, friendly, persuasive)

Support for other email clients (Outlook, Yahoo Mail)

Improve contextual understanding for long email threads

Add multi-language reply support

🧑‍💻 Author

Gaurav Botke
📍 Software Engineer | Java & Web Developer
🔗 GitHub Profile

📄 License

This project feel free to use and modify it for your own projects.
