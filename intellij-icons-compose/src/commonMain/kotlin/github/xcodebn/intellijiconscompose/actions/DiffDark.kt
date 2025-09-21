package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiffDark: ImageVector
    get() {
        if (_DiffDark != null) return _DiffDark!!

        _DiffDark = ImageVector.Builder(
            name = "DiffDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                lineTo(14f, 5f)
                lineTo(10f, 9f)
                lineTo(6f, 5f)
                lineTo(9f, 5f)
                lineTo(9f, 1f)
                lineTo(11f, 1f)
                lineTo(11f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 11f)
                lineTo(8f, 11f)
                lineTo(4f, 15f)
                lineTo(-0f, 11f)
                lineTo(3f, 11f)
                lineTo(3f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11f, 5f)
                    lineTo(14f, 5f)
                    lineTo(10f, 9f)
                    lineTo(6f, 5f)
                    lineTo(9f, 5f)
                    lineTo(9f, 1f)
                    lineTo(11f, 1f)
                    lineTo(11f, 5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 11f)
                    lineTo(8f, 11f)
                    lineTo(4f, 15f)
                    lineTo(-0f, 11f)
                    lineTo(3f, 11f)
                    lineTo(3f, 7f)
                    lineTo(5f, 7f)
                    lineTo(5f, 11f)
                    close()
                }
            }
        }.build()

        return _DiffDark!!
    }

private var _DiffDark: ImageVector? = null

