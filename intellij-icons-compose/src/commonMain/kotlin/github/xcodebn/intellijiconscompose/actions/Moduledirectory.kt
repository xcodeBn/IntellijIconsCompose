package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moduledirectory: ImageVector
    get() {
        if (_Moduledirectory != null) return _Moduledirectory!!

        _Moduledirectory = ImageVector.Builder(
            name = "Moduledirectory",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(14f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 5f)
                lineTo(2f, 3f)
                lineTo(7f, 3f)
                lineTo(8f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(10f, 15f)
                lineTo(15f, 15f)
                lineTo(15f, 10f)
                lineTo(10f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(14f, 9f)
                    lineTo(9f, 9f)
                    lineTo(9f, 13f)
                    lineTo(2f, 13f)
                    lineTo(2f, 5f)
                    lineTo(2f, 3f)
                    lineTo(7f, 3f)
                    lineTo(8f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 9f)
                    close()
                }
            }
        }.build()

        return _Moduledirectory!!
    }

private var _Moduledirectory: ImageVector? = null

