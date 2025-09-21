package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PromptinputDark: ImageVector
    get() {
        if (_PromptinputDark != null) return _PromptinputDark!!

        _PromptinputDark = ImageVector.Builder(
            name = "PromptinputDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 7f)
                lineTo(7f, 5f)
                lineTo(8f, 4f)
                lineTo(12f, 8f)
                lineTo(8f, 12f)
                lineTo(7f, 11f)
                lineTo(9f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _PromptinputDark!!
    }

private var _PromptinputDark: ImageVector? = null

