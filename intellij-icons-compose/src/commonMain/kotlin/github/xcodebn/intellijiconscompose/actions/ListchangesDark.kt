package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListchangesDark: ImageVector
    get() {
        if (_ListchangesDark != null) return _ListchangesDark!!

        _ListchangesDark = ImageVector.Builder(
            name = "ListchangesDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(13f, 7f)
                lineTo(17f, 7f)
                lineTo(12f, 12f)
                lineTo(8f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(9f, 11f)
                lineTo(12f, 11f)
                lineTo(8f, 16f)
                lineTo(3f, 11f)
                lineTo(7f, 11f)
                lineTo(7f, 8f)
                lineTo(9f, 8f)
                lineTo(9f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(13f, 7f)
                    lineTo(17f, 7f)
                    lineTo(12f, 12f)
                    lineTo(8f, 7f)
                    lineTo(11f, 7f)
                    lineTo(11f, 4f)
                    lineTo(13f, 4f)
                    lineTo(13f, 7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(9f, 11f)
                    lineTo(12f, 11f)
                    lineTo(8f, 16f)
                    lineTo(3f, 11f)
                    lineTo(7f, 11f)
                    lineTo(7f, 8f)
                    lineTo(9f, 8f)
                    lineTo(9f, 11f)
                    close()
                }
            }
        }.build()

        return _ListchangesDark!!
    }

private var _ListchangesDark: ImageVector? = null

