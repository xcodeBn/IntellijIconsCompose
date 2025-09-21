package github.xcodebn.intellijiconscompose.scope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Changedfilesall: ImageVector
    get() {
        if (_Changedfilesall != null) return _Changedfilesall!!

        _Changedfilesall = ImageVector.Builder(
            name = "Changedfilesall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(10f, 12f)
                lineTo(10f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(12f, 0f)
                lineTo(12f, 12f)
                lineTo(10f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(12f, 0f)
                lineTo(12f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 0f)
                close()
                moveTo(2f, 2f)
                lineTo(2f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 2f)
                lineTo(2f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(10f, 12f)
                    lineTo(10f, 2f)
                    lineTo(0f, 2f)
                    lineTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 12f)
                    lineTo(10f, 12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(2f, 2f)
                    lineTo(2f, 10f)
                    lineTo(10f, 10f)
                    lineTo(10f, 2f)
                    lineTo(2f, 2f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(2f, 2f)
                    lineTo(2f, 10f)
                    lineTo(10f, 10f)
                    lineTo(10f, 2f)
                    lineTo(2f, 2f)
                    close()
                }
            }
        }.build()

        return _Changedfilesall!!
    }

private var _Changedfilesall: ImageVector? = null

