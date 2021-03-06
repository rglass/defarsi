(ns farsi-trans.core
  (:require [goog.Uri :as Uri]
            [goog.dom :as dom]))

(def expr-id "eval-expr")
(def area-id "eval-result")
(def conversion-table
  { \u0627 \a
    \u0628 \b
    \u067E \p
    \u062A \t
    \u0630 \z
    \u0631 \r
    \u0632 \z
    \u062C \c
    \u062D \h
    \u067D \s
    \u0648 \u
    \u0633 \s
    \u0634 \ş
    \u0635 \s
    \u0643 \k
    \u0646 \n
    \u0647 \h
    \u0637 \t
    \u0639 \h
    \u063A \ğ
    \u062F \d
    \u062E \h
    \u0686 \ç
    \u0698 \j
    \u06AF \g
    \u06CC \y
    \u064A \y})

(defn transcribe-letter [l r-word]
  (if (not (nil? l))
    (str (get conversion-table l)
         (if (not (nil? r-word))
           (transcribe-letter (first r-word) (rest r-word))))))

(defn transcribe [f-word]
  (transcribe-letter (first f-word) (rest f-word)))

(defn build-string [xs]
  (map (fn [x] (String/fromCharCode (.replace x "&#" "")))
            (.split xs ";")))

(defn ^:export main []
  (let [x (.-location js/window)
        href (.-href x)
        loc (goog.Uri. href)
        area (dom/getElement area-id)]
    (dom/setTextContent area
                        (transcribe (build-string (.getParameterValue
                                                   loc
                                                   expr-id))))))
