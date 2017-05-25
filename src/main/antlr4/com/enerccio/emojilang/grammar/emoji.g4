grammar emoji;

compilationUnit:
	packageDeclaration
	EOF
	;

packageDeclaration:
	DeclareEmoji emojiStream EndOfStatementEmoji
	;
	
emojiStream:
	EmojiStream
	;
	
EndOfStatementEmoji:
	[\u{1F914}] // emoji thinking face 🤔
	;
	
DeclareEmoji:
	[\u{1F4E6}] // emoji package 📦
	;
	
EmojiStream:
	[\u3030] | [\u00AE] | [\u00A9] |
	[\u{1D000}-\u{1F77F}] |
	[\u2100-\u27BF] |
	[\uFE00-\uFE0F] |
	[\u{1F900}-\u{1F9FF}] |
	[\u8205]
	;
	
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
;