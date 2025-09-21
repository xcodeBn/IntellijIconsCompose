package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Excludedfromcompile: ImageVector
    get() {
        if (_Excludedfromcompile != null) return _Excludedfromcompile!!

        _Excludedfromcompile = ImageVector.Builder(
            name = "Excludedfromcompile",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(0f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 0f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(6f, 5f)
                lineTo(4f, 3f)
                lineTo(6f, 2f)
                lineTo(5f, 1f)
                lineTo(3f, 3f)
                lineTo(2f, 1f)
                lineTo(1f, 2f)
                lineTo(3f, 3f)
                lineTo(1f, 5f)
                lineTo(2f, 6f)
                lineTo(4f, 4f)
                lineTo(5f, 6f)
                close()
            }
        }.build()

        return _Excludedfromcompile!!
    }

private var _Excludedfromcompile: ImageVector? = null

