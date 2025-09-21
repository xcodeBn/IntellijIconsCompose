package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RuntocursorDark: ImageVector
    get() {
        if (_RuntocursorDark != null) return _RuntocursorDark!!

        _RuntocursorDark = ImageVector.Builder(
            name = "RuntocursorDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(7f, 6f)
                lineTo(10f, 6f)
                lineTo(6f, 10f)
                lineTo(1f, 6f)
                lineTo(5f, 6f)
                lineTo(5f, 1f)
                lineTo(7f, 1f)
                lineTo(7f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(7f, 6f)
                    lineTo(10f, 6f)
                    lineTo(6f, 10f)
                    lineTo(1f, 6f)
                    lineTo(5f, 6f)
                    lineTo(5f, 1f)
                    lineTo(7f, 1f)
                    lineTo(7f, 6f)
                    close()
                }
            }
        }.build()

        return _RuntocursorDark!!
    }

private var _RuntocursorDark: ImageVector? = null

