package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntentionbulbgreyDark: ImageVector
    get() {
        if (_IntentionbulbgreyDark != null) return _IntentionbulbgreyDark!!

        _IntentionbulbgreyDark = ImageVector.Builder(
            name = "IntentionbulbgreyDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 14f)
                lineTo(10f, 14f)
                curveTo(10.50f, 14.55f, 10.05f, 15.00f, 9.50f, 15.00f)
                lineTo(6f, 15f)
                curveTo(5.95f, 15.00f, 5.50f, 14.55f, 5.50f, 14.00f)
                lineTo(6f, 14f)
                close()
                moveTo(13f, 5f)
                curveTo(13.00f, 9.20f, 11.00f, 8.97f, 11.00f, 11.00f)
                lineTo(5f, 11f)
                curveTo(5.00f, 9.03f, 3.00f, 9.20f, 3.00f, 5.20f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(6f, 14f)
                    lineTo(10f, 14f)
                    curveTo(10.50f, 14.55f, 10.05f, 15.00f, 9.50f, 15.00f)
                    lineTo(6f, 15f)
                    curveTo(5.95f, 15.00f, 5.50f, 14.55f, 5.50f, 14.00f)
                    lineTo(6f, 14f)
                    close()
                    moveTo(13f, 5f)
                    curveTo(13.00f, 9.20f, 11.00f, 8.97f, 11.00f, 11.00f)
                    lineTo(5f, 11f)
                    curveTo(5.00f, 9.03f, 3.00f, 9.20f, 3.00f, 5.20f)
                    close()
                }
            }
        }.build()

        return _IntentionbulbgreyDark!!
    }

private var _IntentionbulbgreyDark: ImageVector? = null

