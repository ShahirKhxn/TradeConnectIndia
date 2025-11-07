// Mobile nav toggle
const navToggle = document.getElementById("navToggle");
const mainNav = document.getElementById("mainNav");

navToggle.addEventListener("click", () => {
  mainNav.classList.toggle("open");
});

// Smooth scroll helper
function scrollToSection(id) {
  const el = document.getElementById(id);
  if (!el) return;
  const y = el.getBoundingClientRect().top + window.scrollY - 70;
  window.scrollTo({ top: y, behavior: "smooth" });
}

// Expose to HTML
window.scrollToSection = scrollToSection;

// Contact form handler (fake submit)
function handleFormSubmit(e) {
  e.preventDefault();
  alert(
    "Thank you for your enquiry! A TradeConnect India team member will get in touch with you soon."
  );
  e.target.reset();
}

window.handleFormSubmit = handleFormSubmit;

// Simple modal for service cards
const modalBackdrop = document.getElementById("modalBackdrop");
const modalTitle = document.getElementById("modalTitle");

function openModal(serviceName) {
  if (modalTitle && serviceName) {
    modalTitle.textContent = `Enquiry: ${serviceName}`;
  }
  modalBackdrop.classList.add("active");
}

function closeModal(event) {
  // stop closing when clicking inside modal
  if (event && event.target && event.target.closest && event.target.closest(".modal")) {
    return;
  }
  modalBackdrop.classList.remove("active");
}

window.openModal = openModal;
window.closeModal = closeModal;

// Footer year
document.getElementById("year").textContent = new Date().getFullYear();
