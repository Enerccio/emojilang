grammar emoji;

compilationUnit:
	packageDeclaration
	statements
	EOF
	;
	
packageDeclaration:
	DeclareEmoji identifier EndOfStatementEmoji
	;
	
statements:
	statement*
	;
	
statement:
	importStatement
	defStatement
	;
	
importStatement:
	ImportEmoji ColorEmoji? modulePath EndOfStatementEmoji
	;
	
defStatement:
	DefEmoji ColorEmoji? identifier parameterList block
	;
	
parameterList:
	'(' parameters? ')'
	;
	
parameters:
	identifier (',' identifier)*
	;
	
block:
	BlockStartEmoji statement* BlockEndEmoji
	;
	
modulePath:
	identifier ('.' identifier) EndOfStatementEmoji
	;
	
identifier:
	emojiStream
	;
	
emojiStream:
	EmojiStream
	;
	
DeclareEmoji:
	[\u{1F4E6}] // emoji package 📦
	;
	
ImportEmoji:
	[\u{1F595}] // emoji middle finger 🖕
	;
	
DefEmoji:
	[\u{1F919}] // emoji call me🤙
	;
	
BlockStartEmoji:
	[\u{1F50D}] // emoji left magn. glass 🔍
	;
	
BlockEndEmoji:
	[\u{1F50E}] // emoji right magn. glass 🔎
	;
	
EndOfStatementEmoji:
	[\u26A1] // emoji lightning  ⚡
	;
	
EmojiStream:
	[\u3030] | [\u00AE] | [\u00A9] |
	[\u{1D000}-\u{1F77F}] |
	[\u2100-\u27BF] |
	[\uFE00-\uFE0F] |
	[\u{1F900}-\u{1F9FF}] |
	[\u8205]
	;
	
Modifiers:
	ColorEmoji
	;

ColorEmoji:
	[\u{1F3FB}-\u{1F3FF}] // skin tone
	;
	
	
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
;