package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomefolderDark: ImageVector
    get() {
        if (_HomefolderDark != null) return _HomefolderDark!!

        _HomefolderDark = ImageVector.Builder(
            name = "HomefolderDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 13f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 7f)
                lineTo(12f, 7f)
                lineTo(12f, 13f)
                lineTo(9f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 2f)
                lineTo(15f, 8f)
                lineTo(1f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(9f, 13f)
                    lineTo(9f, 10f)
                    lineTo(7f, 10f)
                    lineTo(7f, 13f)
                    lineTo(4f, 13f)
                    lineTo(4f, 7f)
                    lineTo(12f, 7f)
                    lineTo(12f, 13f)
                    lineTo(9f, 13f)
                    close()
                }
            }
        }.build()

        return _HomefolderDark!!
    }

private var _HomefolderDark: ImageVector? = null

