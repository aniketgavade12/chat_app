function sendMessage() {
    const name = document.getElementById("username").value;
    const message = document.getElementById("messageInput").value;
    const chatBox = document.getElementById("chatBox");

    if (name === "" || message === "") {
        alert("Please enter name and message");
        return;
    }

    const messageDiv = document.createElement("div");
    messageDiv.classList.add("message");
    messageDiv.innerHTML = `<strong>${name}:</strong> ${message}`;

    chatBox.appendChild(messageDiv);

    document.getElementById("messageInput").value = "";
    chatBox.scrollTop = chatBox.scrollHeight;
}
