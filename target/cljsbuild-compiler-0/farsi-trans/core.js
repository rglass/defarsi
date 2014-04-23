goog.provide('farsi_trans.core');
goog.require('cljs.core');
goog.require('goog.dom');
goog.require('goog.dom');
goog.require('goog.Uri');
goog.require('goog.Uri');
farsi_trans.core.expr_id = "eval-expr";
farsi_trans.core.area_id = "eval-result";
farsi_trans.core.conversion_table = cljs.core.PersistentHashMap.fromArrays(["\u0643","\u0646","\u0686","\u0627","\u0647","\u0628","\u0648","\u062A","\u064A","\u062C","\u06CC","\u062D","\u062E","\u062F","\u06AF","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0637","\u0698","\u0639","\u063A","\u067D","\u067E"],["k","n","\u00E7","a","h","b","u","t","y","c","y","h","h","d","g","z","r","z","s","\u015F","s","t","j","h","\u011F","s","p"]);
farsi_trans.core.transcribe_letter = (function transcribe_letter(l,r_word){if(!((l == null)))
{return [cljs.core.str(cljs.core.get.cljs$core$IFn$_invoke$arity$2(farsi_trans.core.conversion_table,l)),cljs.core.str(((!((r_word == null)))?transcribe_letter(cljs.core.first(r_word),cljs.core.rest(r_word)):null))].join('');
} else
{return null;
}
});
farsi_trans.core.transcribe = (function transcribe(f_word){return farsi_trans.core.transcribe_letter(cljs.core.first(f_word),cljs.core.rest(f_word));
});
farsi_trans.core.build_string = (function build_string(xs){return cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (x){return (String.fromCharCode.cljs$core$IFn$_invoke$arity$1 ? String.fromCharCode.cljs$core$IFn$_invoke$arity$1(x.replace("&#","")) : String.fromCharCode.call(null,x.replace("&#","")));
}),xs.split(";"));
});
farsi_trans.core.main = (function main(){var x = window.location;var href = x.href;var loc = (new goog.Uri(href));var area = goog.dom.getElement(farsi_trans.core.area_id);return goog.dom.setTextContent(area,farsi_trans.core.transcribe(farsi_trans.core.build_string(loc.getParameterValue(farsi_trans.core.expr_id))));
});
goog.exportSymbol('farsi_trans.core.main', farsi_trans.core.main);
