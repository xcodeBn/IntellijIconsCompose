package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sortedbyusage: ImageVector
    get() {
        if (_Sortedbyusage != null) return _Sortedbyusage!!

        _Sortedbyusage = ImageVector.Builder(
            name = "Sortedbyusage",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 8f)
                curveTo(7.90f, 8.00f, 7.00f, 7.10f, 7.00f, 6.00f)
                close()
                moveTo(9f, 7f)
                curveTo(9.55f, 7.00f, 10.00f, 6.55f, 10.00f, 6.00f)
                close()
                moveTo(14f, 12f)
                curveTo(12.90f, 12.00f, 12.00f, 11.10f, 12.00f, 10.00f)
                close()
                moveTo(14f, 11f)
                curveTo(14.55f, 11.00f, 15.00f, 10.55f, 15.00f, 10.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 10f)
                lineTo(9f, 14f)
                lineTo(1f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 4f)
                lineTo(13f, 3f)
                lineTo(12f, 12f)
                lineTo(10f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 8f)
                    curveTo(7.90f, 8.00f, 7.00f, 7.10f, 7.00f, 6.00f)
                    close()
                    moveTo(9f, 7f)
                    curveTo(9.55f, 7.00f, 10.00f, 6.55f, 10.00f, 6.00f)
                    close()
                    moveTo(14f, 12f)
                    curveTo(12.90f, 12.00f, 12.00f, 11.10f, 12.00f, 10.00f)
                    close()
                    moveTo(14f, 11f)
                    curveTo(14.55f, 11.00f, 15.00f, 10.55f, 15.00f, 10.00f)
                    close()
                }
            }
        }.build()

        return _Sortedbyusage!!
    }

private var _Sortedbyusage: ImageVector? = null

