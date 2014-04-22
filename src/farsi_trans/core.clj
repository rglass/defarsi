(ns farsi-trans.core)

(defn transcribe-letter [l r_word]
  (if (not (nil? l))
    (str (cond
          (= l \u0627) \a
          (= l \u0628) \b
          (= l \u0635) \s
          (= l \u062F) \d
          (= l \u06CC) \y)
         (if (not (nil? r_word))
           (transcribe-letter (first r_word) (rest r_word))))))

(defn transcribe [f_word]
  (transcribe-letter (first f_word) (rest f_word)))

