package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExasolDark: ImageVector
    get() {
        if (_ExasolDark != null) return _ExasolDark!!

        _ExasolDark = ImageVector.Builder(
            name = "ExasolDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 10f)
                lineTo(10f, 7f)
                lineTo(14f, 13f)
                lineTo(10f, 13f)
                lineTo(8f, 10f)
                close()
                moveTo(9f, 6f)
                lineTo(7f, 9f)
                lineTo(9f, 6f)
                close()
                moveTo(10f, 6f)
                lineTo(8f, 3f)
                lineTo(10f, 0f)
                lineTo(14f, 0f)
                lineTo(10f, 6f)
                close()
                moveTo(7f, 4f)
                lineTo(9f, 6f)
                lineTo(7f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(9f, 6f)
                lineTo(4f, 13f)
                lineTo(0f, 13f)
                lineTo(5f, 6f)
                lineTo(0f, 0f)
                lineTo(4f, 0f)
                lineTo(9f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(8f, 10f)
                    lineTo(10f, 7f)
                    lineTo(14f, 13f)
                    lineTo(10f, 13f)
                    lineTo(8f, 10f)
                    close()
                    moveTo(9f, 6f)
                    lineTo(7f, 9f)
                    lineTo(9f, 6f)
                    close()
                    moveTo(10f, 6f)
                    lineTo(8f, 3f)
                    lineTo(10f, 0f)
                    lineTo(14f, 0f)
                    lineTo(10f, 6f)
                    close()
                    moveTo(7f, 4f)
                    lineTo(9f, 6f)
                    lineTo(7f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF499C54))
                ) {
                    moveTo(9f, 6f)
                    lineTo(4f, 13f)
                    lineTo(0f, 13f)
                    lineTo(5f, 6f)
                    lineTo(0f, 0f)
                    lineTo(4f, 0f)
                    lineTo(9f, 6f)
                    close()
                }
            }
        }.build()

        return _ExasolDark!!
    }

private var _ExasolDark: ImageVector? = null

