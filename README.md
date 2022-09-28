 Design Patterns              {"@context": "http://schema.org", "@graph": \[{"@type":"Person","@id":"https://refactoring.guru/#founder","name":"Alexander Shvets"},{"@type":"Organization","@id":"https://refactoring.guru/#organization","name":"Refactoring.Guru","description":"Refactoring.Guru makes it easy for you to discover everything you need to know about refactoring, design patterns, SOLID principles, and other smart programming topics.","image":{"@type":"ImageObject","@id":"https://refactoring.guru/#organizationlogo","url":"https://refactoring.guru/images/content-public/logos/logo-plain.png","caption":"Refactoring.Guru"},"logo":{"@id":"https://refactoring.guru/#organizationlogo"},"founder":{"@id":"https://refactoring.guru/#founder"},"sameAs":\["https://www.facebook.com/refactoring.guru","https://twitter.com/RefactoringGuru","https://github.com/RefactoringGuru"\]},{"@type":"WebSite","@id":"https://refactoring.guru/#website","url":"https://refactoring.guru/","name":"Refactoring.Guru","description":"Refactoring.Guru makes it easy for you to discover everything you need to know about refactoring, design patterns, SOLID principles, and other smart programming topics.","author":{"@id":"https://refactoring.guru/#founder"},"publisher":{"@id":"https://refactoring.guru/#organization"},"copyrightYear":2014},{"@type":"WebPage","@id":"https://refactoring.guru/design-patterns#webpage","url":"https://refactoring.guru/design-patterns","inLanguage":"en","name":"Design Patterns","description":"Design Patterns are typical solutions to commonly occurring problems in software design. They are blueprints that you can customize to solve a particular design problem in your code.","isPartOf":{"@id":"https://refactoring.guru#website"},"breadcrumb":{"@id":"https://refactoring.guru/design-patterns#breadcrumb"},"primaryImageOfPage":{"@id":"https://refactoring.guru/design-patterns#primaryimage"},"image":{"@type":"ImageObject","@id":"https://refactoring.guru/design-patterns#primaryimage","url":"https://refactoring.guru/images/patterns/content/index-design-patterns-3x.png","width":1398,"height":600}},{"@type":"BreadcrumbList","@id":"https://refactoring.guru/design-patterns#breadcrumb","itemListElement":\[{"@type":"ListItem","position":1,"name":"Home","item":"https://refactoring.guru"},{"@type":"ListItem","position":2,"name":"Design Patterns","item":"https://refactoring.guru/design-patterns"}\]}\] }     @font-face{font-family:'PT Sans';font-style:normal;font-weight:400;font-display:swap;src:local("PT Sans"),local("PTSans-Regular"),url(/fonts/PTSans/ptsans-regular\_cyrillic-ext.woff2?1) format("woff2");unicode-range:U+0460-052F,U+1C80-1C88,U+20B4,U+2DE0-2DFF,U+A640-A69F,U+FE2E-FE2F}@font-face{font-family:'PT Sans';font-style:normal;font-weight:400;font-display:swap;src:local("PT Sans"),local("PTSans-Regular"),url(/fonts/PTSans/ptsans-regular\_cyrillic.woff2?1) format("woff2");unicode-range:U+0400-045F,U+0490-0491,U+04B0-04B1,U+2116}@font-face{font-family:'PT Sans';font-style:normal;font-weight:400;font-display:swap;src:local("PT Sans"),local("PTSans-Regular"),url(/fonts/PTSans/ptsans-regular\_latin-ext.woff2?1) format("woff2");unicode-range:U+0100-024F,U+0259,U+1E00-1EFF,U+2020,U+20A0-20AB,U+20AD-20CF,U+2113,U+2C60-2C7F,U+A720-A7FF}@font-face{font-family:'PT Sans';font-style:normal;font-weight:400;font-display:swap;src:local("PT Sans"),local("PTSans-Regular"),url(/fonts/PTSans/ptsans-regular\_latin.woff2?1) format("woff2");unicode-range:U+0000-00FF,U+0131,U+0152-0153,U+02BB-02BC,U+02C6,U+02DA,U+02DC,U+2000-206F,U+2074,U+20AC,U+2122,U+2191,U+2193,U+2212,U+2215,U+FEFF,U+FFFD}@font-face{font-family:'PT Sans';font-style:normal;font-weight:400;font-display:swap;src:local("PT Sans"),local("PTSans-Regular"),url(/fonts/PTSans/ptsans-regular\_en.woff2?1) format("woff2");unicode-range:U+0-FF,U+131,U+142,U+152,U+153,U+2BB,U+2BC,U+2C6,U+2DA,U+2DC,U+420,U+423,U+430,U+438-43A,U+43D,U+440,U+441,U+443,U+44C,U+457,U+2000-206F,U+2074,U+20AA-20AC,U+20B4,U+20B9,U+20BA,U+20BD,U+2122,U+2191,U+2193,U+2212,U+2215,U+FEFF,U+FFFD}@font-face{font-family:'PT Sans';font-style:normal;font-weight:700;font-display:swap;src:local("PT Sans Bold"),local("PTSans-Bold"),url(/fonts/PTSans/ptsans-bold\_cyrillic-ext.woff2?1) format("woff2");unicode-range:U+0460-052F,U+1C80-1C88,U+20B4,U+2DE0-2DFF,U+A640-A69F,U+FE2E-FE2F}@font-face{font-family:'PT Sans';font-style:normal;font-weight:700;font-display:swap;src:local("PT Sans Bold"),local("PTSans-Bold"),url(/fonts/PTSans/ptsans-bold\_cyrillic.woff2?1) format("woff2");unicode-range:U+0400-045F,U+0490-0491,U+04B0-04B1,U+2116}@font-face{font-family:'PT Sans';font-style:normal;font-weight:700;font-display:swap;src:local("PT Sans Bold"),local("PTSans-Bold"),url(/fonts/PTSans/ptsans-bold\_latin-ext.woff2?1) format("woff2");unicode-range:U+0100-024F,U+0259,U+1E00-1EFF,U+2020,U+20A0-20AB,U+20AD-20CF,U+2113,U+2C60-2C7F,U+A720-A7FF}@font-face{font-family:'PT Sans';font-style:normal;font-weight:700;font-display:swap;src:local("PT Sans Bold"),local("PTSans-Bold"),url(/fonts/PTSans/ptsans-bold\_latin.woff2?1) format("woff2");unicode-range:U+0000-00FF,U+0131,U+0152-0153,U+02BB-02BC,U+02C6,U+02DA,U+02DC,U+2000-206F,U+2074,U+20AC,U+2122,U+2191,U+2193,U+2212,U+2215,U+FEFF,U+FFFD}@font-face{font-family:'PT Sans';font-style:normal;font-weight:700;font-display:swap;src:local("PT Sans Bold"),local("PTSans-Bold"),url(/fonts/PTSans/ptsans-bold\_en.woff2?1) format("woff2");unicode-range:U+0-FF,U+131,U+142,U+152,U+153,U+2BB,U+2BC,U+2C6,U+2DA,U+2DC,U+420,U+423,U+430,U+438-43A,U+43D,U+440,U+441,U+443,U+44C,U+457,U+2000-206F,U+2074,U+20AA-20AC,U+20B4,U+20B9,U+20BA,U+20BD,U+2122,U+2191,U+2193,U+2212,U+2215,U+FEFF,U+FFFD}   

![](/images/content-public/announcement-en-1.svg?id=2b6bba0470947f2a60cdac20b809cf3d)

Hey, I have just reduced the price for all products. Let's prepare our programming skills for the post-COVID era. [Check it out »](/store)

![](/images/content-public/announcement-en-2.svg?id=d0c7bf36cfcc7c733fad50a30fd99920)

 [](#checkout)[](#checkout)

.illustration-container { position: relative; transform-origin: 0 0; } .illustration-container a.btn { display: block; } .illustration-container h3 { margin-bottom: 1rem; } .dp-bg { display: none; } @media (min-width: 712px) { .illustration-container { height: 1430px; } .illustration-container a.btn { display: inline-block; } .text .dp-bg { display: inline-block; margin-top: 15px; max-width: none; position: absolute; width: 960px; height: 1410px; } .bg-1, .bg-2, .bg-3, .bg-4, .bg-5, .bg-6, .bg-7 { position: absolute; } .bg-1 { left: 0px; top: 0px; } .bg-2 { left: 659px; top: 0px; } .bg-3 { left: 63px; top: 328px; } .bg-4 { left: 63px; top: 531px; } .bg-5 { left: 0px; top: 733px; } .bg-6 { left: 24px; top: 978px; } .bg-7 { left: 538px; top: 978px; } .dp1-h, .dp-h3 { margin-top: 0 !important; } .dp-abs { position: absolute; min-height: 48px; } .dp-c { text-align: center; } .dp-l { text-align: left; } .dp-r { text-align: right; } .dp1-h-1 { font-size: 80px !important; line-height: 54px !important; } .dp1-h-2 { font-size: 57px !important; line-height: 60px !important; } .dp-h3 { font-size: 32px !important; } .dp-b span { box-shadow: #fff 0 0 0 3px; display: inline-block; border-radius: 5px; } .dp-p span { display: block; } .dp1-h { left: 285px; top: 12px; width: 390px; } .dp1-p { left: 270px; top: 130px; width: 420px; white-space: pre; } .dp1-b { left: 270px; top: 240px; width: 420px; } .dp2-h { left: 0px; top: 300px; width: 380px; } .dp2-p { left: 0px; top: 340px; width: 340px; white-space: pre; } .dp2-b { left: 0px; top: 450px; width: 340px; } .dp3-h { left: 520px; top: 300px; width: 440px; } .dp3-p { left: 520px; top: 340px; width: 440px; white-space: pre; } .dp3-b { left: 520px; top: 450px; width: 440px; } .dp4-bg { background: rgba(255, 255, 255, 0.9); border-radius: 15px; } .dp4-bg { left: 312px; top: 616px; width: 335px; height: 165px; } .dp4-h { left: 312px; top: 625px; width: 335px; } .dp4-p { left: 312px; top: 664px; width: 335px; white-space: pre; } .dp4-b { left: 312px; top: 725px; width: 335px; } .dp5-bg { background: rgba(255, 255, 255, 0.9); border-top-right-radius: 15px; border-bottom-right-radius: 15px; } .dp5-bg { left: 0px; top: 980px; width: 333px; height: 130px; } .dp5-h { left: 0px; top: 990px; width: 350px; } .dp5-p { left: 0px; top: 1030px; width: 390px; white-space: pre; } .dp5-b { left: 0px; top: 1120px; width: 360px; } .dp6-bg { background: rgba(255, 255, 255, 0.9); border-top-left-radius: 15px; border-bottom-left-radius: 15px; } .dp6-bg { left: 627px; top: 980px; width: 333px; height: 130px; } .dp6-h { left: 520px; top: 990px; width: 440px; } .dp6-p { left: 520px; top: 1030px; width: 440px; white-space: pre; } .dp6-b { left: 520px; top: 1120px; width: 440px; } .dp7-bg { left: 300px; top: 1050px; width: 362px; height: 345px; overflow: hidden; } .dp7-bg:before { content: " "; display: block; transform-origin: 50% 50%; transform: rotateZ(45deg); border: solid 5px #e74c3c; background: #e74c3c linear-gradient(135deg, #e74c3c, #d12345); border-radius: 30px; width: 270px; height: 270px; margin-top: 45px; margin-left: 45px; } .dp7-abs-link { left: 345px; top: 1095px; display: block; transform-origin: 50% 50%; transform: rotateZ(45deg); width: 270px; height: 270px; } .dp7-h, .dp7-p { color: white; } .dp7-h { margin-top: 0 !important; } .dp7-span1 { font-size: 22px; line-height: 20px; font-style: italic; font-weight: bold; margin-top: 7px; } .dp7-span2 { font-size: 26px; line-height: 36px; font-weight: bold; font-style: italic; text-transform: uppercase; letter-spacing: -1px; } .dp7-h { left: 302px; top: 1080px; width: 355px; height: 70px; } .dp7-p { left: 300px; top: 1185px; width: 355px; height: 80px; white-space: pre; } .dp7-b { left: 300px; top: 1350px; width: 355px; height: 88px; } .dp7-b a { position: relative; z-index: 1; } }

![](/images/patterns/content/index/full/patterns-01.png?id=e9cf5363691b460aa690c2716ce35557) ![](/images/patterns/content/index/full/patterns-02.png?id=852cce7f8e3d0f671aa564fc58ef087c) ![](/images/patterns/content/index/full/patterns-03.png?id=c16d3d331bd52a9401d3a0aa9739ef07) ![](/images/patterns/content/index/full/patterns-04.png?id=329f9f25bd494356ee6d7c8f13a8a00e) ![](/images/patterns/content/index/full/patterns-05.png?id=81a79a6331dc204ca9e5518886c35c5d) ![](/images/patterns/content/index/full/patterns-06.png?id=6e9f2eb37390dcef978d3564a3aac9fe) ![](/images/patterns/content/index/full/patterns-07.png?id=84a7ce1869da402b9abdfb5ae09c9133)

Design Patterns
===============

[![Design Patterns](/images/patterns/content/index/patterns-i1.png?id=ccf20fa726f8a7349011e4dff2979773)](/design-patterns/what-is-pattern "Intro to design patterns")

**Design patterns** are typical solutions to common problems in software design. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code.

[What's a design pattern?](/design-patterns/what-is-pattern)

### Catalog of patterns

[![Catalog of patterns](/images/patterns/content/index/patterns-i2.png?id=1353d99b8a70879775283988d02efdbb)](/design-patterns/catalog "Catalog of patterns")

List of 22 classic design patterns, grouped by their intent.

[Look inside the catalog »](/design-patterns/catalog)

### Benefits of patterns

[![Benefits of patterns](/images/patterns/content/index/patterns-i3.png?id=8acb54bc13ec54391a2a450330f9106a)](/design-patterns/why-learn-patterns "Benefits of patterns")

Patterns are a toolkit of solutions to common problems in software design. They define a common language that helps your team communicate more efficiently.

[More about the benefits »](/design-patterns/why-learn-patterns)

### Classification

[![Classification of patterns](/images/patterns/content/index/patterns-i4.png?id=5dd6f87d69e030386098aa4cf5236d28)](/design-patterns/classification "Classification of patterns")

Design patterns differ by their complexity, level of detail and scale of applicability. In addition, they can be categorized by their intent and divided into three groups.

[More about the categories »](/design-patterns/classification)

### History of patterns

[![History of patterns](/images/patterns/content/index/patterns-i5.png?id=6f49fee3f60a379d9a414fd5a69bfd56)](/design-patterns/history "History of patterns")

Who invented patterns and when? Can you use patterns outside software development? How do you do that?

[More about the history »](/design-patterns/history)

### Criticism of patterns

[![Criticism of patterns](/images/patterns/content/index/patterns-i6.png?id=20ae9547b03be0cc7fb276824b70c0a4)](/design-patterns/criticism "Criticism of patterns")

Are patterns as good as advertised? Is it always possible to use them? Can patterns sometimes be harmful?

[More about the criticism »](/design-patterns/criticism)

### Dive Into Design Patterns

[![Design patterns book](/images/patterns/banners/patterns-book-banner-3.png?id=7d445df13c80287beaab234b4f3b698c)](/design-patterns/book "Design patterns book: Dive Into Design Patterns")

Check out our ebook on design patterns and principles. It's available in PDF/ePUB/MOBI formats and includes the archive with code examples in Java, C#, C++, PHP, Python, Ruby, Go, Swift, & TypeScript.

[Learn more about the book](/design-patterns/book)

[](/design-patterns/book)

[](#menu)[![Refactoring.Guru](/images/content-public/logos/logo-military-mobile.png?id=65ecbd1e688fc695bc20c22a1e8450d9)](/)

Facebook

Twitter

*   Language
    
    [English](https://refactoring.guru/design-patterns "English") [Español](https://refactoring.guru/es/design-patterns "Español") [Français](https://refactoring.guru/fr/design-patterns "Français") [日本語](https://refactoring.guru/ja/design-patterns "日本語") [Polski](https://refactoring.guru/pl/design-patterns "Polski") [Português Brasileiro](https://refactoring.guru/pt-br/design-patterns "Português Brasileiro") [Русский](https://refactoring.guru/ru/design-patterns "Русский") [Українська](https://refactoring.guru/uk/design-patterns "Українська") [中文](https://refactoringguru.cn/design-patterns "中文")
    
*   [Contact us](https://feedback.refactoring.guru/?show_feedback_form_private=true "Contact us")
*   [Log in](https://refactoring.guru/login "Log in")

[HELP UKRAINE **STOP RUSSIA**](/help-ukraine)

[](#menu-close)

[EnglishEnglish](https://refactoring.guru/design-patterns "English") [EspañolEspañol](https://refactoring.guru/es/design-patterns "Español") [FrançaisFrançais](https://refactoring.guru/fr/design-patterns "Français") [日本語日本語](https://refactoring.guru/ja/design-patterns "日本語") [PolskiPolski](https://refactoring.guru/pl/design-patterns "Polski") [Português BrasileiroPortuguês-Br](https://refactoring.guru/pt-br/design-patterns "Português Brasileiro") [РусскийРусский](https://refactoring.guru/ru/design-patterns "Русский") [УкраїнськаУкраїнська](https://refactoring.guru/uk/design-patterns "Українська") [中文中文](https://refactoringguru.cn/design-patterns "中文")

[![Refactoring.Guru](/images/content-public/logos/logo-military.png?id=3eaf203cb26279327252e2c5f5d37c7f)](/)

[HELP UKRAINE  
**STOP RUSSIA**](/help-ukraine)

*   [Premium Content](/store)
    *   [Design Patterns eBook](/design-patterns/book)
    *   [Refactoring Course](/refactoring/course)
*   [Refactoring](/refactoring)
    *   [What is Refactoring](/refactoring/what-is-refactoring)
        *   [Clean code](/refactoring/what-is-refactoring)
        *   [Technical debt](/refactoring/technical-debt)
        *   [When to refactor](/refactoring/when)
        *   [How to refactor](/refactoring/how-to)
    *   [Catalog](/refactoring/catalog)
    *   [Code Smells](/refactoring/smells)
        *   [Bloaters](/refactoring/smells/bloaters)
            *   [Long Method](/smells/long-method)
            *   [Large Class](/smells/large-class)
            *   [Primitive Obsession](/smells/primitive-obsession)
            *   [Long Parameter List](/smells/long-parameter-list)
            *   [Data Clumps](/smells/data-clumps)
        *   [Object-Orientation Abusers](/refactoring/smells/oo-abusers)
            *   [Switch Statements](/smells/switch-statements)
            *   [Temporary Field](/smells/temporary-field)
            *   [Refused Bequest](/smells/refused-bequest)
            *   [Alternative Classes with Different Interfaces](/smells/alternative-classes-with-different-interfaces)
        *   [Change Preventers](/refactoring/smells/change-preventers)
            *   [Divergent Change](/smells/divergent-change)
            *   [Shotgun Surgery](/smells/shotgun-surgery)
            *   [Parallel Inheritance Hierarchies](/smells/parallel-inheritance-hierarchies)
        *   [Dispensables](/refactoring/smells/dispensables)
            *   [Comments](/smells/comments)
            *   [Duplicate Code](/smells/duplicate-code)
            *   [Lazy Class](/smells/lazy-class)
            *   [Data Class](/smells/data-class)
            *   [Dead Code](/smells/dead-code)
            *   [Speculative Generality](/smells/speculative-generality)
        *   [Couplers](/refactoring/smells/couplers)
            *   [Feature Envy](/smells/feature-envy)
            *   [Inappropriate Intimacy](/smells/inappropriate-intimacy)
            *   [Message Chains](/smells/message-chains)
            *   [Middle Man](/smells/middle-man)
        *   [Other Smells](/refactoring/smells/other)
            *   [Incomplete Library Class](/smells/incomplete-library-class)
    *   [Refactorings](/refactoring/techniques)
        *   [Composing Methods](/refactoring/techniques/composing-methods)
            *   [Extract Method](/extract-method)
            *   [Inline Method](/inline-method)
            *   [Extract Variable](/extract-variable)
            *   [Inline Temp](/inline-temp)
            *   [Replace Temp with Query](/replace-temp-with-query)
            *   [Split Temporary Variable](/split-temporary-variable)
            *   [Remove Assignments to Parameters](/remove-assignments-to-parameters)
            *   [Replace Method with Method Object](/replace-method-with-method-object)
            *   [Substitute Algorithm](/substitute-algorithm)
        *   [Moving Features between Objects](/refactoring/techniques/moving-features-between-objects)
            *   [Move Method](/move-method)
            *   [Move Field](/move-field)
            *   [Extract Class](/extract-class)
            *   [Inline Class](/inline-class)
            *   [Hide Delegate](/hide-delegate)
            *   [Remove Middle Man](/remove-middle-man)
            *   [Introduce Foreign Method](/introduce-foreign-method)
            *   [Introduce Local Extension](/introduce-local-extension)
        *   [Organizing Data](/refactoring/techniques/organizing-data)
            *   [Self Encapsulate Field](/self-encapsulate-field)
            *   [Replace Data Value with Object](/replace-data-value-with-object)
            *   [Change Value to Reference](/change-value-to-reference)
            *   [Change Reference to Value](/change-reference-to-value)
            *   [Replace Array with Object](/replace-array-with-object)
            *   [Duplicate Observed Data](/duplicate-observed-data)
            *   [Change Unidirectional Association to Bidirectional](/change-unidirectional-association-to-bidirectional)
            *   [Change Bidirectional Association to Unidirectional](/change-bidirectional-association-to-unidirectional)
            *   [Replace Magic Number with Symbolic Constant](/replace-magic-number-with-symbolic-constant)
            *   [Encapsulate Field](/encapsulate-field)
            *   [Encapsulate Collection](/encapsulate-collection)
            *   [Replace Type Code with Class](/replace-type-code-with-class)
            *   [Replace Type Code with Subclasses](/replace-type-code-with-subclasses)
            *   [Replace Type Code with State/Strategy](/replace-type-code-with-state-strategy)
            *   [Replace Subclass with Fields](/replace-subclass-with-fields)
        *   [Simplifying Conditional Expressions](/refactoring/techniques/simplifying-conditional-expressions)
            *   [Decompose Conditional](/decompose-conditional)
            *   [Consolidate Conditional Expression](/consolidate-conditional-expression)
            *   [Consolidate Duplicate Conditional Fragments](/consolidate-duplicate-conditional-fragments)
            *   [Remove Control Flag](/remove-control-flag)
            *   [Replace Nested Conditional with Guard Clauses](/replace-nested-conditional-with-guard-clauses)
            *   [Replace Conditional with Polymorphism](/replace-conditional-with-polymorphism)
            *   [Introduce Null Object](/introduce-null-object)
            *   [Introduce Assertion](/introduce-assertion)
        *   [Simplifying Method Calls](/refactoring/techniques/simplifying-method-calls)
            *   [Rename Method](/rename-method)
            *   [Add Parameter](/add-parameter)
            *   [Remove Parameter](/remove-parameter)
            *   [Separate Query from Modifier](/separate-query-from-modifier)
            *   [Parameterize Method](/parameterize-method)
            *   [Replace Parameter with Explicit Methods](/replace-parameter-with-explicit-methods)
            *   [Preserve Whole Object](/preserve-whole-object)
            *   [Replace Parameter with Method Call](/replace-parameter-with-method-call)
            *   [Introduce Parameter Object](/introduce-parameter-object)
            *   [Remove Setting Method](/remove-setting-method)
            *   [Hide Method](/hide-method)
            *   [Replace Constructor with Factory Method](/replace-constructor-with-factory-method)
            *   [Replace Error Code with Exception](/replace-error-code-with-exception)
            *   [Replace Exception with Test](/replace-exception-with-test)
        *   [Dealing with Generalization](/refactoring/techniques/dealing-with-generalization)
            *   [Pull Up Field](/pull-up-field)
            *   [Pull Up Method](/pull-up-method)
            *   [Pull Up Constructor Body](/pull-up-constructor-body)
            *   [Push Down Method](/push-down-method)
            *   [Push Down Field](/push-down-field)
            *   [Extract Subclass](/extract-subclass)
            *   [Extract Superclass](/extract-superclass)
            *   [Extract Interface](/extract-interface)
            *   [Collapse Hierarchy](/collapse-hierarchy)
            *   [Form Template Method](/form-template-method)
            *   [Replace Inheritance with Delegation](/replace-inheritance-with-delegation)
            *   [Replace Delegation with Inheritance](/replace-delegation-with-inheritance)
*   [Design Patterns](/design-patterns)
    *   [What is a Pattern](/design-patterns/what-is-pattern)
        *   [What's a design pattern?](/design-patterns/what-is-pattern)
        *   [History of patterns](/design-patterns/history)
        *   [Why should I learn patterns?](/design-patterns/why-learn-patterns)
        *   [Criticism of patterns](/design-patterns/criticism)
        *   [Classification of patterns](/design-patterns/classification)
    *   [Catalog](/design-patterns/catalog)
    *   [Creational Patterns](/design-patterns/creational-patterns)
        *   [Factory Method](/design-patterns/factory-method)
        *   [Abstract Factory](/design-patterns/abstract-factory)
        *   [Builder](/design-patterns/builder)
        *   [Prototype](/design-patterns/prototype)
        *   [Singleton](/design-patterns/singleton)
    *   [Structural Patterns](/design-patterns/structural-patterns)
        *   [Adapter](/design-patterns/adapter)
        *   [Bridge](/design-patterns/bridge)
        *   [Composite](/design-patterns/composite)
        *   [Decorator](/design-patterns/decorator)
        *   [Facade](/design-patterns/facade)
        *   [Flyweight](/design-patterns/flyweight)
        *   [Proxy](/design-patterns/proxy)
    *   [Behavioral Patterns](/design-patterns/behavioral-patterns)
        *   [Chain of Responsibility](/design-patterns/chain-of-responsibility)
        *   [Command](/design-patterns/command)
        *   [Iterator](/design-patterns/iterator)
        *   [Mediator](/design-patterns/mediator)
        *   [Memento](/design-patterns/memento)
        *   [Observer](/design-patterns/observer)
        *   [State](/design-patterns/state)
        *   [Strategy](/design-patterns/strategy)
        *   [Template Method](/design-patterns/template-method)
        *   [Visitor](/design-patterns/visitor)
    *   [Code Examples](/design-patterns/examples)
        *   [C#](/design-patterns/csharp)
        *   [C++](/design-patterns/cpp)
        *   [Go](/design-patterns/go)
        *   [Java](/design-patterns/java)
        *   [PHP](/design-patterns/php)
        *   [Python](/design-patterns/python)
        *   [Ruby](/design-patterns/ruby)
        *   [Rust](/design-patterns/rust)
        *   [Swift](/design-patterns/swift)
        *   [TypeScript](/design-patterns/typescript)

[Log in](https://refactoring.guru/login "Log in") [Contact us](https://feedback.refactoring.guru/ "Contact us")

*   [Home](/)
*   [Refactoring](/refactoring)
*   [Design Patterns](/design-patterns)
*   [Premium Content](/store)
*   [Forum](https://refactoring.userecho.com/)
*   [Contact us](https://refactoring.userecho.com/)

*   [](https://www.facebook.com/refactoring.guru)
*   [](/sendy/form)
*   [](https://github.com/RefactoringGuru)

2014-2022 [Refactoring.Guru](/). All rights reserved.  
Illustrations by [Dmitry Zhart](http://zhart.us/)

 ![Organization address](/images/content-public/icons/fa-building.svg?id=afddb5806968b0a9acfc1df75a181234)Khmelnitske shosse 19 / 27, Kamianets-Podilskyi, Ukraine, 32305  
Email: [\[email protected\]](/cdn-cgi/l/email-protection)

*   [Terms & Conditions](/terms)
*   [Privacy Policy](/privacy-policy)
*   [Content Usage Policy](/content-usage-policy)

function extend(){var extended={};var deep=false;var i=0;var length=arguments\["length"\];if(Object\["prototype"\]\["toString"\]\["call"\](arguments\[0\])=== '\[object Boolean\]'){deep= arguments\[0\];i++};var merge=function(obj){for(var prop in obj){if(Object\["prototype"\]\["hasOwnProperty"\]\["call"\](obj,prop)){if(deep&& Object\["prototype"\]\["toString"\]\["call"\](obj\[prop\])=== '\[object Object\]'){extended\[prop\]= extend(true,extended\[prop\],obj\[prop\])}else {extended\[prop\]= obj\[prop\]}}}};for(;i< length;i++){var obj=arguments\[i\];merge(obj)};return extended} function defer(method) {if (window.jQuery) {method();} else {setTimeout(function() { defer(method) }, 50);}} +function(sd){sd = (typeof sd === "string") ? JSON.parse(atob(sd)) : sd;for(var property in sd){if(window\[property\]!== null&& typeof window\[property\]=== 'object'){window\[property\]= extend(true,window\[property\],sd\[property\])}else {window\[property\]= sd\[property\]}}}("eyJsb2NhbGUiOiJlbiIsImxvY2FsZV9wcmVmaXgiOiIiLCJsb2NhbGl6ZWRfdXJsX3ByZWZpeF9tIjoiaHR0cHM6XC9cL3JlZmFjdG9yaW5nLmd1cnVcLyIsInVybF9wcmVmaXhfbSI6Imh0dHBzOlwvXC9yZWZhY3RvcmluZy5ndXJ1XC8iLCJsb2NhbGl6ZWRfdXJsX3ByZWZpeCI6Imh0dHBzOlwvXC9yZWZhY3RvcmluZy5ndXJ1XC8iLCJ1cmxfcHJlZml4IjoiaHR0cHM6XC9cL3JlZmFjdG9yaW5nLmd1cnVcLyIsImNoaW5lc2VfaG9tZSI6Imh0dHBzOlwvXC9yZWZhY3RvcmluZ2d1cnUuY25cLyIsInVzZXJfZWNob19hbGlhcyI6InJlZmFjdG9yaW5nIiwidXNlcl9lY2hvX2hvc3QiOiJmZWVkYmFjay5yZWZhY3RvcmluZy5ndXJ1IiwidXNlcl9lY2hvX3ByaXZhdGVfZm9ydW0iOiIyIiwidXNlcl9lY2hvX2xvY2FsZSI6ImVuIiwidXNlcl9lY2hvX3B1YmxpY19mb3J1bSI6IjMiLCJ1c2VyX2VjaG9fcHVibGljX2ZvcnVtX3VybCI6Imh0dHBzOlwvXC9mZWVkYmFjay5yZWZhY3RvcmluZy5ndXJ1XC8iLCJ1c2VyX2VjaG9fc3NvX3Rva2VuIjoiIn0="); if (window.dataLayer && window.google\_optimize) { window.dataLayer.push({'event': 'optimize.activate'}); } .async-hide { opacity: 0 !important} (function(a,s,y,n,c,h,i,d,e){s.className+=' '+y;h.start=1\*new Date; h.end=i=function(){s.className=s.className.replace(RegExp(' ?'+y),'')}; (a\[n\]=a\[n\]||\[\]).hide=h;setTimeout(function(){i();h.end=null},c);h.timeout=c; })(window,document.documentElement,'async-hide','dataLayer',4000, {'GTM-M58XZN4':true});  var getCookie = function(name) { var nameEQ = name + "="; var ca = document.cookie.split(';'); for(var i=0;i < ca.length;i++) { var c = ca\[i\]; while (c.charAt(0)==' ') c = c.substring(1,c.length); if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length); } return null; }; var eraseCookie = function (name) { document.cookie = name+'=; Path=/; Max-Age=-99999999;'; }; window.google\_analytics = 'UA-521840-40'; (function(i,s,o,g,r,a,m){i\['GoogleAnalyticsObject'\]=r;i\[r\]=i\[r\]||function(){ (i\[r\].q=i\[r\].q||\[\]).push(arguments)},i\[r\].l=1\*new Date();a=s.createElement(o), m=s.getElementsByTagName(o)\[0\];a.async=1;a.src=g;m.parentNode.insertBefore(a,m) })(window,document,'script','https://www.google-analytics.com/analytics.js','ga'); var ga\_queue = \[\]; window.gaOnCreate = function(){ ga\_queue.push(arguments); }; doTracking(); function doTracking(clientId) { window.gaOnCreate = function(){ ga.apply(this, arguments); }; var options = { 'siteSpeedSampleRate': 100 }; if (clientId) { options.clientId = clientId; } ga('create', 'UA-521840-40', options); ga('require', 'GTM-M58XZN4'); window.google\_optimize = 'GTM-M58XZN4'; // Fix broken Social Login referrer. window.social\_login\_provider = window.social\_login\_provider || getCookie('social\_login\_provider'); if (window.social\_login\_provider) { ga('set', 'referrer', null); ga('send', 'social', window.social\_login\_provider, 'login', window.location.href); eraseCookie('social\_login\_provider'); } var user\_id = getCookie('user\_id'); if (user\_id) { ga('set', 'userId', user\_id); } else { ga('set', 'userId', null); } var location = document.location.href; if (typeof window.analytics\_path\_prefix === 'string') { if (/^(https?:\\/\\/\[^\\/\]+?)\\/$/.test(location)) { location = location.replace(/(https?:\\/\\/\[^\\/\]+?)\\//, '$1' + window.analytics\_path\_prefix); } else { location = location.replace(/(https?:\\/\\/\[^\\/\]+?)\\//, '$1' + window.analytics\_path\_prefix + '/'); } ga('set', 'location', location); } if (typeof window.analytics\_location\_prefix === 'string') { location = location.replace(/(https?:\\/\\/\[^\\/\]+?)\\//, window.analytics\_location\_prefix); ga('set', 'location', location); } ga('require', 'ec'); ga('send', 'pageview', (typeof window.analytics\_path\_prefix === 'string' ? window.analytics\_path\_prefix : '') + document.location.pathname); ga\_queue.forEach(function(item){ ga.apply(this, item); }); } window.socialLikesButtons = { facebook: { counterUrl: "", convertNumber: null }, }; var CodeMirrorScripts = \["/js/codemirror.min.js?id=b603f86e2764c138b55d9660343151b3"\]; window.loadContent = true;window.loadCart = true;
