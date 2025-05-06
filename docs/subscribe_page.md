# Documentation: Subscription Page (`subscribe.html`)

## Purpose
The `subscribe.html` page allows users to select a GigEfx Labs service and submit their information for subscription.

---

## Features Implemented

### 1. **Service Selection Form**
- Collects user **name**, **email**, and **desired service** using a dropdown.
- Uses `mailto:` action to send data to `subscribe@gigefx.io`.
- Each service option reflects pricing and naming.

### 2. **Styling Enhancements**
- Clean, centered layout using `.container` and `.card` classes.
- Uses the global `style.css` for consistency.
- Responsive and readable input fields and dropdown.

### 3. **User Interface Enhancements**
- Animated background glow with CSS `@keyframes` and `blur()` filter.
- Highlight bar accent above the form title.
- `← Home` button in the top-left corner for easy navigation.
- Fade-in scroll animation via IntersectionObserver for smooth entrance.

### 4. **Step Indicators**
- Sections within the form are labeled as "Step 1" and "Step 2" for clarity.

### 5. **Testimonial Quote**
- Quote included under the form to build trust and add depth.

---

## File: `subscribe.html`

### Main Elements
| Element | Purpose |
|--------|---------|
| `<form>`       | Submits data using `mailto:`         |
| `<select>`     | Allows users to choose a service     |
| `.btn`         | Styled button reused across site     |
| `.step-label`  | Subheadings for form steps           |
| `<blockquote>` | Optional testimonial for user trust  |

---

## Usage

1. The user fills out their **name**, **email**, and selected service.
2. They click **Submit Subscription**, which triggers their default email client.
3. Email is prefilled with form data and sent to `subscribe@gigefx.io`.

---

## Future Enhancements

- Replace `mailto:` with an actual backend (e.g., Formspree, Flask, Firebase).
- Add form validation with JavaScript.
- Implement success message or redirect after submission.
- Make the dropdown dynamically preselected from project links.

---