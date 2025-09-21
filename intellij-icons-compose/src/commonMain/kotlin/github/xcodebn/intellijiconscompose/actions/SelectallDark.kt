package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SelectallDark: ImageVector
    get() {
        if (_SelectallDark != null) return _SelectallDark!!

        _SelectallDark = ImageVector.Builder(
            name = "SelectallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(12f, 2f)
                lineTo(10f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 10f)
                lineTo(14f, 8f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                lineTo(12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(14f, 2f)
                lineTo(16f, 4f)
                lineTo(9f, 11f)
                lineTo(5f, 7f)
                lineTo(6f, 6f)
                lineTo(9f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(12f, 2f)
                    lineTo(10f, 4f)
                    lineTo(4f, 4f)
                    lineTo(4f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 10f)
                    lineTo(14f, 8f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 2f)
                    lineTo(12f, 2f)
                    close()
                }
            }
        }.build()

        return _SelectallDark!!
    }

private var _SelectallDark: ImageVector? = null

