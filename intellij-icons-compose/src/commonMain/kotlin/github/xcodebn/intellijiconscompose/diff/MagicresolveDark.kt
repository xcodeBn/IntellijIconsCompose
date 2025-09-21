package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MagicresolveDark: ImageVector
    get() {
        if (_MagicresolveDark != null) return _MagicresolveDark!!

        _MagicresolveDark = ImageVector.Builder(
            name = "MagicresolveDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(0f, 10f)
                lineTo(2f, 12f)
                lineTo(9f, 4f)
                lineTo(8f, 3f)
                lineTo(0f, 10f)
                close()
                moveTo(6f, 5f)
                lineTo(8f, 3f)
                lineTo(9f, 4f)
                lineTo(7f, 6f)
                lineTo(6f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(11f, 8f)
                lineTo(10f, 9f)
                lineTo(9f, 7f)
                lineTo(9f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 0f)
                lineTo(8f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 2f)
                lineTo(4f, 1f)
                lineTo(5f, 2f)
                lineTo(5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 4f)
                lineTo(10f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(0f, 10f)
                    lineTo(2f, 12f)
                    lineTo(9f, 4f)
                    lineTo(8f, 3f)
                    lineTo(0f, 10f)
                    close()
                    moveTo(6f, 5f)
                    lineTo(8f, 3f)
                    lineTo(9f, 4f)
                    lineTo(7f, 6f)
                    lineTo(6f, 5f)
                    close()
                }
            }
        }.build()

        return _MagicresolveDark!!
    }

private var _MagicresolveDark: ImageVector? = null

