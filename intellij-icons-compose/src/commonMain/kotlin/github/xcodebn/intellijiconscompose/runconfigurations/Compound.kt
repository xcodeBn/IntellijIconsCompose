package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Compound: ImageVector
    get() {
        if (_Compound != null) return _Compound!!

        _Compound = ImageVector.Builder(
            name = "Compound",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(15f, 10f)
                lineTo(9f, 6f)
                lineTo(9f, 13f)
                lineTo(1f, 13f)
                lineTo(1f, 2f)
                curveTo(1.00f, 2.02f, 1.02f, 2.00f, 1.05f, 2.00f)
                lineTo(5f, 2f)
                curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                lineTo(8f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(10f, 8f)
                lineTo(16f, 12f)
                lineTo(10f, 16f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(15f, 10f)
                    lineTo(9f, 6f)
                    lineTo(9f, 13f)
                    lineTo(1f, 13f)
                    lineTo(1f, 2f)
                    curveTo(1.00f, 2.02f, 1.02f, 2.00f, 1.05f, 2.00f)
                    lineTo(5f, 2f)
                    curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                    lineTo(8f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 10f)
                    close()
                }
            }
        }.build()

        return _Compound!!
    }

private var _Compound: ImageVector? = null

