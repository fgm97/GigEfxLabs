
# GigEfx Labs Webpage 

This project is a modern, animated, and responsive introductory webpage for **GigEfx Labs**, a parent company showcasing innovative Africa-focused ventures. The page is designed to inform users about GigEfx’s mission, highlight its flagship projects, and allow visitors to subscribe to specific services.

## Live Demo

This project can be viewed by opening `GigEfxLabs.html` in a web browser.

---

## Project Structure

```
📂 GigEfxLabs Project
├── GigEfxLabs.html        # Main landing page
├── subscribe.html         # Subscription form for services
├── style.css              # Global stylesheet for layout and theming
└── logo.png               # Company logo (used in header)
```

---

## Navigation Overview

The top sticky navbar provides links to the following sections:

- **About** — Summary of GigEfx Labs’ mission and innovation philosophy.
- **Projects** — An interactive breakdown of services (SmartCart, SmartPrint, BounceBack, RapidForge).
- **Investors** — A thank-you note acknowledging investor contributions.
- **Contact** — Email, website, and business hours.
- **Subscribe** — Link to the standalone subscription form (`subscribe.html`).

---

## Features

### Animated Intro

- Fade-in animations for the logo, headline, and description.
- Radial gradient background effect adds depth and motion.

### Project Dropdowns

Each project is represented as a **card** with:
- A colored sidebar and theme.
- Click-to-toggle dropdowns revealing:
  - Overview
  - Features
  - Unique value
  - Pricing

### Contact & Inquiry

- Contact section includes company details and an email-based inquiry form.
- Inquiry form uses `mailto:` for direct submissions.

### Subscription Page

The `subscribe.html` form allows users to:
1. Enter personal information
2. Select a service from a dropdown
3. Submit a subscription request via email

The page includes a back-to-home button, animated background blur, and testimonial quote.

---

## Styling

- **CSS Variables** for consistent color and shadow management.
- **Animations** for logo, text, background motion, dropdowns, and section entrances.
- **Project-Specific Theming** for unique color accents.
- **Responsive Design** optimized for desktop and mobile devices.

---

## Development Tools

- **HTML5**: Structure of content across all pages.
- **CSS3**: Styling, layout, animations, and responsive design.
- **JavaScript (Vanilla)**: Dropdown toggle logic, scroll-triggered animations, and mobile nav interactions.
- **VS Code**: Primary development environment.
- **Live Server Extension**: Real-time previewing during development.
- **GitHub**: Source control and project hosting.
- **Email (mailto:) Integration**: Basic form submission method without server-side scripting.

---

## Future Roadmap

| Milestone                          | Description                                                    | Status     |
|------------------------------------|----------------------------------------------------------------|------------|
| Convert Forms to Backend        | Implement server-side handling using Node.js, Flask, or PHP    | Planned    |
| Deploy Online                   | Host project using GitHub Pages or Netlify                     | Planned    |
| Improve Mobile Responsiveness   | Further test and tweak layout on smaller screens               | In Progress|
| Add Dark/Light Mode Switch      | Provide theme toggle for user preferences                      | Planned    |
| Add Analytics                   | Track user engagement (e.g. with Plausible or Google Analytics)| Planned    |
| Add CMS Integration             | Allow admin to update content dynamically                      | Future     |
| Usability Testing               | Gather feedback to refine UX and page flow                     | Ongoing    |

---

## External Assets

- `logo.png`: Company logo displayed in header.
- Fonts: Uses system fonts (`Segoe UI`, `Tahoma`) for universal compatibility.
- Email submission: Uses `mailto:` without backend logic.

---

## Not In Scope

The `subscribe.html` file and associated features were later extracted and relocated to a folder named **`N.I.S` (Not In Scope)**. This preserves modularity and prevents overloading the landing page, while keeping the feature accessible.

---

## Contact

For questions or suggestions, please contact:  
[info@gigefx.io](mailto:info@gigefx.io)  
[www.gigefx.io](https://www.gigefx.io)

---

# Installation & Start Instructions

## 1.Download the Project Files

Clone or download the repository containing the source code:

```bash
git clone https://github.com/your-username/your-repo-name.git
```

Or manually download and unzip the project folder.

---

## 2. Project Structure

Ensure the following structure is preserved:

```
your-repo-name/
└── frontend/
    ├── GigEfxLabs.html
    ├── Subscribe.html
    ├── style.css
    └── assets/
        └── logo.png
```

---

## 3. Running the Web Page

### Option A: Run Locally

You can run the webpage by simply opening either `GigEfxLabs.html` or `Subscribe.html` in any modern web browser (e.g., Chrome, Firefox, Edge).

> No local server is needed, as this is a static site.

### Option B: Use Live Server (Recommended for Development)

If you're using Visual Studio Code, you can use the **Live Server** extension for a better development experience:

1. Open the project folder (`frontend`) in VS Code.
2. Install the **Live Server** extension if you haven't already.
3. Right-click on `GigEfxLabs.html` and choose **"Open with Live Server"**.
4. Your browser will automatically open the site and refresh on changes.

---

## 4. Hosting the Site (For Administrators)

You can deploy the project using any static web hosting service such as:

- GitHub Pages
- Netlify
- Vercel
- Firebase Hosting

### Example: GitHub Pages Deployment

1. Push the contents of the `frontend` folder to a GitHub repository.
2. Go to **Settings** → **Pages**.
3. Under “Source,” select the `main` branch and `/frontend` folder as the root.
4. GitHub Pages will generate a public URL for your site.